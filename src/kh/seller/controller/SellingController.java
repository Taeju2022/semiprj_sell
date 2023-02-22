package kh.seller.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.seller.service.SellerService;
import kh.seller.vo.ProductVo;


@WebServlet("/Selling")
public class SellingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SellingController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductVo productVo = new ProductVo();
		SellerService sservice = new SellerService();
		sservice.selling(productVo);
	}

}
