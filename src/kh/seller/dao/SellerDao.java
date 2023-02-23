
package kh.seller.dao;
import static kh.seller.jdbc.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import kh.seller.vo.ProductVo;
import kh.seller.vo.SellerVo;

public class SellerDao {
 
	public SellerDao() {}
	
	public int login(Connection conn, SellerVo vo) {
		
		String sql = "select COUNT(*) CNT FROM SHOP_SELLER "
				+ " where SELLER_ID = ? AND SELLER_PASSWORD =?";
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getSellerId());
			pstmt.setString(2, vo.getSellerPassword());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		return result;
	}

	public int selling(Connection conn, ProductVo productVo) {
		//order, product
		//
		String sql = "SELECT PRODUCT_ID, SALE_PRICE, SALE_DATE, ORDER_NAME, ORDER_STATUS FROM SHOP_CUSTOMER "
				+ " WHERE ORDER_STATUS = COMPLETE";
		String sql2 = "SELECT PRODUCT_NAME WHERE PRODUCT_ID = ? "; 
		
		//String sql = "PRODUCT_ID, S
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = conn.prepareStatement(sql);
		
		try {		
			pstmt.setString(1, productVo.getProductName());
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int salePrice = Integer.parseInt(rs.getString(1));
				Date saleDate = rs.getString(2);
				String orderName = rs.getString(3);
				String orderStatus = rs.getString(4);	
			}
			
		


		
		
		
		

		PreparedStatement patmt2 = null;

		ResultSet rs2 = null;

			
			
			
		
		} catch(Exception e) {
			rs.close();
			rs2.close();
			pstmt.close();
			pstmt2.close();
			
		}
		
		return 0;
	}
	
}
