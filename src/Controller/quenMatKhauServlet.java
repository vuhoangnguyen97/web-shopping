package Controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BusinessLogics.userBL;
import JavaBeans.user;

@WebServlet("/quenMatKhauServlet")
public class quenMatKhauServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public quenMatKhauServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       	request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("txtUsername");
		String email = request.getParameter("txtEmail");
		
		user thanhVienQuenMatKhau = userBL.ResetPassword(username, email);
		
		if(thanhVienQuenMatKhau != null) {
			// tìm thấy tên và email thành viên này trong csdl
			final String admin = "testmailbaitap@gmail.com";
			final String password_admin = "Vuhoangnguyen";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			
			Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(admin, password_admin);
					}
			});
			
			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("testmailbaitap@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
				message.setSubject("Khôi phục mật khẩu");
				message.setText("Chào bạn ," + thanhVienQuenMatKhau.getTen_user()
					+ "Mật khẩu của bạn đã đặt là: " + thanhVienQuenMatKhau.getPassword()
					+ "\n\n Email của bạn: " + email
					+ "\n\n Bạn vui lòng kiểm tra lại, và thay đổi nếu cần thiết"
					+ "\n\n Thân! "
					+ "\n\n Admin" );

				Transport.send(message);

				System.out.println("Done");
				request.getRequestDispatcher("Views/Success.jsp").forward(request, response);
			} catch (MessagingException e) {
				request.getRequestDispatcher("Views/loi-reset.jsp").forward(request, response);

				throw new RuntimeException(e);
			}

		
		}
		else{
			response.sendRedirect("loi-reset.jsp");
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
