package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.util.DBUtil;

public class UserDaoImp implements UserDao{
	DBUtil dbUtil = new DBUtil();
	
	@Override
	public User2 queryUser(String account, String password) {
		User2 user2 = null;
		String sql = "select account,password,type from  t_user where account = ? and password = ?";
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, account,password);
        	if(resultSet.next()){
        		user2 =new User2();
        		user2.setAccount(resultSet.getString("account"));
        		user2.setPassword(resultSet.getString("password"));
        		user2.setType(resultSet.getInt("type"));
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user2;
	}

}
