package com.edu.seiryo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

/**
 * 
 * User数据处理类
 * @author WANGQI
 */
public class UserDao {
	DBUtil dbUtil = new DBUtil();
    //用户注册
    public boolean registe(User user) {
    	String sql = "insert into UserSystem (userName, password) values (?, ?)";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, user.getUserName(),user.getUserPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
    }
    //用户登录
    public boolean login(User user) {
        String sql = "select id from UserSystem where userName = ? and password = ?";
        boolean bo = false;
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getUserName(),user.getUserPassword());
        	bo = resultSet.next();
        } catch (Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return bo;
    }
}
