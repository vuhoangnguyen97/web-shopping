package Test;

import static org.junit.Assert.*;

import java.sql.*;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import BusinessLogics.Database;
import BusinessLogics.nhanVienBL;
import BusinessLogics.quanLyGioHang;
import BusinessLogics.sanPhamBL;
import BusinessLogics.userBL;
import JavaBeans.nhanVien;
import JavaBeans.sanPham;
import JavaBeans.user;

public class testCSDL {
	Connection con;
	Statement stm;
	
	@Before
	public void chuanBi() {
		con = Database.connect();
	}
	
	@Test
	public void testConnection() {
		assertNotNull(con);
	}
	
	@Test
	public void findAllUser() {
		// tổng cộng hiện tại là 3
		assertEquals(3 , userBL.docTatCa().size());
	}
	
	@Test
	public void findAllSanPhamFail() {
		// tổng cộng hiện tại là 45
		assertEquals(3 , sanPhamBL.DocTatCa().size());
	}
	
	@Test
	public void findAllSanPham() {
		// tổng cộng hiện tại là 45
		assertTrue(sanPhamBL.DocTatCa().size() == 45 );
	}
	
	@Test
	public void findAllGioHang() {
		assertEquals(10 , quanLyGioHang.xemTatCa().size());
	}
	
	@Test
	public void TimSanPhamID() {
		sanPham test = sanPhamBL.docTheoID(2);
		assertTrue(test.getTenSanPham().equals("iPhone 6"));
	}
	
	@Test
	public void timSanPhamTheoHang() {
		List<sanPham> dssp = sanPhamBL.timKiemTheoHang("Apple");
		assertTrue(dssp.size() == 3);
	}
	
	@Test
	public void timSanPhamTheoTen() {
		List<sanPham> dssp = sanPhamBL.timTheoTen("iphone");
		assertTrue(dssp.size() == 4);
	}
	
	@Test
	public void dangKy() {
		// test nếu nhập sót các trường dữ liệu khác thì báo lỗi
		// test case pass nếu thông báo lỗi
		String username = "abcde";
		String password = "123456";
		user u = new user();
		u.setUsername(username);
		u.setPassword(password);
		
		int them = userBL.dangKy(u);
		assertTrue(them > 0);
	}
	
	@Test
	public void dangNhapUser() {
		// đăng nhập đúng
		String user = "test";
		String pass = "test";
		
		user u = userBL.DocTheoUsernamePassword(user, pass);
		assertTrue(u != null);
	}
	
	@Test
	public void dangNhapUserSai() {
		// đăng nhập đúng
		// Test case pass nếu thông báo lỗi
		String user = "test";
		String pass = "test1";
		
		user u = userBL.DocTheoUsernamePassword(user, pass);
		assertTrue(u != null);
	}
	
	@Test
	public void dangKyNhanVien() {
		String user = "abc";
		String pass = "abc";
		nhanVien nv = new nhanVien();
		nv.setUsername(user);
		nv.setPassword(pass);
		int them = nhanVienBL.dangKyNhanVien(nv);
		
		assertTrue(them > 0); // sẽ báo lỗi, vì thiếu vào dữ liệu --> pass
	}
	
	@Test
	public void dangNhapNhanVien() {
		String user = "admin";
		String pass = "admin";
		nhanVien nv = nhanVienBL.docTheoUsernamePassword(user, pass);
		assertTrue(nv != null);
	}
}
