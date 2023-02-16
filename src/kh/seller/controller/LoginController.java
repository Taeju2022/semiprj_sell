package kh.seller.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.seller.vo.SellerVo;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
    	super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sellerId = request.getParameter("sellerId");
		String sellerPassword = request.getParameter("sellerPassword");
		
		SellerVo vo = new SellerVo();
		vo.setSellerId(sellerId);
		vo.setSellerPassword(sellerPassword);
		
		//int result = new MemberService().login(vo);
		response.sendRedirect("");
	}

}
