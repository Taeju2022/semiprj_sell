package kh.seller.dao;

import kh.seller.jdbc.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kh.seller.vo.SellerVo;



public class SellerDao {
 
	public SellerVo login(Connection conn, SellerVo vo) {
		
		SellerVo result = null;
		String sql = "select SELLER_ID, SELLER_PASSWORD FROM SHOP_SELLER";
		sql += " WHERE SELLER_ID = ? AND SELLER_PASSWORD";
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try {

			
		} catch (Exception e) {

		} finally {
			
		}
		SellerVo vo = null;
		return result;
	}

	
}
