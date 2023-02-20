package kh.seller.service;
import static kh.seller.jdbc.JDBCTemplate.*;
import java.sql.Connection;
import kh.seller.dao.SellerDao;
import kh.seller.vo.SellerVo;



public class SellerService {
	//로그인
	public SellerVo loginSeller(SellerVo vo) {
		SellerVo result = null;
		Connection conn = getConnection();
		result = new SellerDao().login(conn, vo);
		close(conn);
		return result;
	}
}
