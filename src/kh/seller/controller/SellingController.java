package kh.seller.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.seller.service.SellerService;

/**
 * Servlet implementation class SellingController
 */
@WebServlet("/Selling")
public class SellingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SellingController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SellerService sservice = new SellerService();
		sservice.selling();
	}

}
