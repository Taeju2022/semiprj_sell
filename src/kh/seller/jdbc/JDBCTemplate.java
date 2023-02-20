package kh.seller.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {

	
	public JDBCTemplate() {}
	
	public static Connection getConnection() {
		Connection con = null;
		Properties prop = new Properties();
		try {
			String currentPath = JDBCTemplate.class.getResource("./").getPath();
			prop.load(new BufferedReader(new FileReader(currentPath + "driver.properties")));
			Class.forName(prop.getProperty("driver"));
			con = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("sellerId"), prop.getProperty("sellerPassword"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return con;
	}
	
	
	
//	private static JDBCTemplate instance;
//	private JDBCTemplate() {}
//	
//	public JDBCTemplate getInstance() {
//		if(instance ==null) {
//			instance = new JDBCTemplate();
//		}
//		return instance;
//	}
//	
//	
//	
//	public static Connection getConnection() {
//		Connection conn = null;
//		Properties prop = new Properties();
//		
//		try {
//			String currpath = JDBCTemplate.class.getResource("./").getPath();
//			String filePath = currpath + ".properties";
//			prop.load(new BufferedReader(new FileReader(new File(filePath))));
//			Class.forName(prop.getProperty(""));
//			conn = DriverManager.getConnection(prop.getProperty("1h.url"), prop.getProperty("1h.username"), prop.getProperty("1h.password"));
//		
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("OJDBC jar 없음");
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("연결실패1");
//		} finally {
//			if(conn == null) {
//				System.out.println("연결실패2");
//			} else {
//				System.out.println("!연결성공!");
//			}
//		}		
//		return conn;
//	}

	
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void commit(Connection con) {
		try {
			if(con != null && !con.isClosed()) {
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection con) {
		try {
			if(con != null && !con.isClosed()) {
				con.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
