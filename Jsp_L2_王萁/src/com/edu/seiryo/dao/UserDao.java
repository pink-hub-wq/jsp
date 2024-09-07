package com.edu.seiryo.dao;

import java.sql.ResultSet;

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
    public boolean regist(User user) {
    	String sql = "insert into t_user values (?, ?,?,?)";
    	boolean bo = false;
    	if(isUserExist(user)){
    		return false;
    	}
        try {
        	bo = dbUtil.excuteUpdate(sql, user.getAccount(),user.getPassword(),user.getSex(),user.getEmail());
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
    //检查用户是否存在
    public boolean isUserExist(User user) {
    	String sql = "select account from t_user where account = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getAccount());
        	if(resultSet.next()){
        		bo = true;
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
		return bo;
    }
}
