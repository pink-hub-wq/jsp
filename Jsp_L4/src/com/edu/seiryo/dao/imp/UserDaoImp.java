package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.List;

import com.edu.seiryo.dao.Userdao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * User数据处理类
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao.imp
 * @file_name UserDaoImp.java
 * @classname UserDaoImp
 * @version
 */
public class UserDaoImp implements Userdao{
	DBUtil dbUtil = new DBUtil();
	/**
	 * 登录
	 */
	public User login(String account,String password) {
		String sql = "select userName,password from userdata2 where userName = ? and password = ?";
        ResultSet resultSet = null;
        User user = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,account,password);
        	if(resultSet.next()){
        		user = new User(resultSet.getString("userName"),resultSet.getString("password"));
        	}
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return user;
	}

}
