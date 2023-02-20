package kh.seller.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.seller.service.SellerService;
import kh.seller.vo.SellerVo;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
    	super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/sellerLogin.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SellerService sservice = new SellerService();
		
		String sellerId = request.getParameter("sellerId");
		String sellerPassword = request.getParameter("sellerPassword");
		
		SellerVo sellerVo = new SellerVo();
		sellerVo.setSellerId(sellerId);
		sellerVo.setSellerPassword(sellerPassword);
		
		SellerVo s = sservice.loginSeller(sellerVo);
		if(s!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("seller", s);			
		} else {
			System.out.println("로그인 실패");
		}
		
		response.sendRedirect("/WEB-INF/view/sellerMain.jsp");
	}

	
}
