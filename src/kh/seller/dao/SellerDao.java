package kh.seller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static kh.seller.jdbc.JDBCTemplate.*;

import kh.seller.vo.SellerVo;

public class SellerDao {
	public SellerVo login(Connection conn, SellerVo vo) {
		
		SellerVo result = null;
		String sql = "select SELLER_ID, SELLER PASSWORD ";
		sql +=" from SHOP_SELLER WHERE ID=? AND PASSWORD=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getSellerId());
			pstmt.setString(2, vo.getSellerPassword());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new SellerVo();
				result.setSellerId(rs.getString("sellerId"));
			}			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return result;
	}
	
}
