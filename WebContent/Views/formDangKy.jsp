<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div class="container_fullwidth">
	<div class="container">
	<div class="row">
		<jsp:include page="/Views/menu-ben-trai.jsp"></jsp:include>
		<div class="col-md-9">
              <div class="checkout-page">
                <ol class="checkout-steps">
                  <li class="steps">
                    <div class="step-title">
	                    <a href="dang-nhap.jsp" class="step-title">
	                      01. Bạn đã có tài khoản ?
	                    </a>
                      
                    </div>
                  </li>
                  <li class="steps active">
                    <a href="dang-ky.jsp" class="step-title">
                      02. Thành viên mới ?
                    </a>
                    <div class="step-description">
                      <form>
                        <div class="row">
                          <div class="col-md-6 col-sm-6">
                            <div class="your-details">
                              <h5>
                                Đăng ký thành viên
                              </h5>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Username 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Mật khẩu 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="password" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Lập lại mật khẩu: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="password" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Họ: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Tên: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Số điện thoại: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="pass-wrap">
                                <div class="form-row">
                                  <label class="lebel-abs">
                                    Email: 
                                    <strong class="red">
                                      *
                                    </strong>
                                  </label>
                                  <input type="text" class="input namefild" name="">
                                </div>
                              </div>
                              
                            </div>
                          </div>
                          <div class="col-md-6 col-sm-6">
                            <div class="your-details">
                              <h5>
                                Địa chỉ giao hàng
                              </h5>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Địa chỉ
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Thành phố:
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Quốc gia: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              <div class="form-row">
                                <label class="lebel-abs">
                                  Zip code: 
                                  <strong class="red">
                                    *
                                  </strong>
                                </label>
                                <input type="text" class="input namefild" name="">
                              </div>
                              
                              <button>
                                Đăng ký
                              </button>
                            </div>
                          </div>
                        </div>
                      </form>
                    </div>
                  </li>
                  
                </ol>
              </div>
            </div>	</div>
          <div class="clearfix">
          </div>
          <jsp:include page="/Views/lien-ket-thuong-hieu.jsp"></jsp:include>
        </div>
      </div>
     </div>