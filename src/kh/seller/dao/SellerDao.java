
package kh.seller.dao;
import static kh.seller.jdbc.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kh.seller.vo.SellerVo;

public class SellerDao {
 
	public SellerDao() {}
	
	public int login(Connection conn, SellerVo vo) {
		
		String sql = "select COUNT(*) CNT FROM SHOP_SELLER "
				+ " where SELLER_ID = ? AND SELLER_PASSWORD =?";
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		int result = 0;
		System.out.println("dao : " + vo);
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

	public int selling(Connection conn, SellerVo vo) {

		return 0;
	}
	
}
