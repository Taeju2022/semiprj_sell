package kh.seller.service;

import java.sql.Connection;

import kh.seller.dao.SellerDao;
import kh.seller.vo.SellerVo;

public class SellerService {
	//로그인
	public int login(SellerVo vo) {
		int result = -1;
		Connection conn = getConnection();
		result = new SellerDao().login(conn, vo);
		close(conn);
		return result;
	}
}
