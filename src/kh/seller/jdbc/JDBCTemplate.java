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
			prop.load(new BufferedReader(new FileReader(currentPath + "seller.properties")));
			Class.forName(prop.getProperty("lh.driver"));
			con = DriverManager.getConnection(prop.getProperty("lh.url"),
					prop.getProperty("lh.username"), prop.getProperty("lh.password"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return con;
	}

	
	
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
