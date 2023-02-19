package kh.seller.service;
import static kh.seller.jdbc.JDBCTemplate.*;
import java.sql.Connection;
<<<<<<< HEAD
=======

>>>>>>> 9e1d018465b3579185e1d9c295e88c543dc430c7
import kh.seller.dao.SellerDao;
import kh.seller.vo.SellerVo;



public class SellerService {
	//로그인
	public SellerVo login(SellerVo vo) {
		SellerVo result = null;
		Connection conn = getConnection();
		result = new SellerDao().login(conn, vo);
		close(conn);
		return result;
	}
}
