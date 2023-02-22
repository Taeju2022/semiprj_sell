package kh.seller.service;
import static kh.seller.jdbc.JDBCTemplate.*;
import java.sql.Connection;
import kh.seller.dao.SellerDao;
import kh.seller.vo.SellerVo;



public class SellerService {
	//로그인
	public int loginSeller(SellerVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = new SellerDao().login(conn, vo);
		System.out.println("serv : " + vo);
		close(conn);
		return result;
	}

	public void selling(SellerVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = new SellerDao().selling(conn, vo);
		close(conn);
		return result;
		
	}
}
