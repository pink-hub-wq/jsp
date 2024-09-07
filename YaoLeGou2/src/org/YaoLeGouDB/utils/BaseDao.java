package org.YaoLeGouDB.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {

	//定义字符串
	private static final String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/yaolegoudb";
	private String UserName = "root";
	private String Password = "123";
	//加载驱动
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//关闭连接
	public Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,UserName,Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public void CloseAll(Connection conn,Statement stmt,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*public void CloseAll(ResultSet rs, Statement stmt, Connection conn){
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	//增删改
	public boolean executeUpdate(String sql,Object[] sz){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int row = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			if(sz != null){
				for (int i = 0; i < sz.length; i++) {
					pstmt.setObject(i+1, sz[i]);
				}
			}
			row = pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			CloseAll(conn, pstmt,null );
		}
		return row > 0;
	}
	//查询
	public ResultSet executeQuery(String sql,Object[] sz){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			if(sz != null){
				for (int i = 0; i < sz.length; i++) {
					pstmt.setObject(i+1,sz[i]);
				}
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
