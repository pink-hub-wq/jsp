package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.DBUtil;

public class UserDaoImp implements UserDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * µÇÂ¼
	 */
	public UserInfo login(UserInfo userInfo) {
		String sql = "select * from tb_userInfo where userName=? and usePassword = ?";
    	ResultSet resultSet = null;
    	UserInfo userInfo1 = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, userInfo.getUserName(),userInfo.getUsePassword());
        	if(resultSet.next()){
        		userInfo1 =new UserInfo();
        		userInfo1.setUserName(resultSet.getString("userName"));
        		userInfo1.setUsePassword(resultSet.getString("usePassword"));
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
		return userInfo1;
	}

}
