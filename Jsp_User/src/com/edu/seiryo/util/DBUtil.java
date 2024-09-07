package com.edu.seiryo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.standard.RequestingUserName;

public class DBUtil {
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;DataBaseName=userList";
    private static final String username = "sa";
    private static final String pwd = "123";
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    
    //增删改
    public static boolean excuteUpdate(String sql,Object...objects) throws SQLException, ClassNotFoundException{
    	boolean bo = false;
    	try {
    		preparedStatement = createPreparedStatement(sql,objects);
        	bo =  preparedStatement.executeUpdate() > 0 ? true : false;
        }finally {
				close();
			} 
    	return bo;
		}
    
    //查询
    public static ResultSet excuteQuery(String sql,Object...objects) throws SQLException, ClassNotFoundException{
    		preparedStatement = createPreparedStatement(sql,objects);
            resultSet = preparedStatement.executeQuery(); 
        	return resultSet;
    }
    
    //关
    public static void close() throws SQLException{
    	if(connection != null){
    		connection.close();
    		connection = null;
    	}
    	if(preparedStatement != null){
    		preparedStatement.close();
    		preparedStatement = null;
    	}
    	if(resultSet != null){
    		resultSet.close();
    		resultSet = null;
    	}
    }
    private static PreparedStatement createPreparedStatement(String sql,Object...objects) throws ClassNotFoundException, SQLException{
    	Class.forName(driver);
    	connection = DriverManager.getConnection(url,username,pwd);
    	preparedStatement = connection.prepareStatement(sql);
    	for (int i = 0; i < objects.length; i++) {
    		preparedStatement.setObject(i + 1, objects[i]);
		}
    	return preparedStatement;
    }
}
