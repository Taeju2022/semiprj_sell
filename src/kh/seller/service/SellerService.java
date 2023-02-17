package kh.seller.service;

import java.sql.Connection;

import kh.seller.dao.SellerDao;
import kh.seller.vo.SellerVo;

import kh.seller.jdbc.*;

public class SellerService {
	//로그인
	public int login(SellerVo vo) {
		SellerVo result = null;
		Connection conn = getConnection();
		result = new SellerDao().login(conn, vo);
		close(conn);
		return result;
	}
}
