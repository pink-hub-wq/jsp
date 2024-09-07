package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.JDBCUTILE;

public class UserDaoImp implements UserDao{
	JDBCUTILE jdbcutile = new JDBCUTILE();
	/**
	 * 检查用户名是否存在
	 */
	public boolean checkUserName(String userName) {
		String sql = "select * from  users where username = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = jdbcutile.selectDataBaseTable(sql, userName);
        	if(resultSet.next()){
        		bo = true;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 注册
	 */
	public boolean regist(User user) {
		String sql = "insert into users (username, password, email) values (?, ?, ?)";
    	boolean bo = false;
        try {
        	bo = jdbcutile.upDataBaseTable(sql, user.getUserName(),user.getPassword(),user.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 登录
	 */
	public User login(String userName, String password) {
		String sql = "select username from users where userName = ? and password=?";
    	boolean bo = false;
    	ResultSet resultSet = null;
    	User user = null;
        try {
        	resultSet = jdbcutile.selectDataBaseTable(sql,userName,password);
        	if(resultSet.next()){
        		user = new User(userName, password);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	/**
	 * 查看所有用户信息
	 */
	public List<User> queryAllUser() {
		String sql = "select * from users";
    	ResultSet resultSet = null;
    	List<User> list = new ArrayList<User>();
        try {
        	resultSet = jdbcutile.selectDataBaseTable(sql);
        	while(resultSet.next()){
        		User user = new User();
        		user.setId(resultSet.getInt("userId"));
        		user.setUserName(resultSet.getString("username"));
        		user.setPassword(resultSet.getString("password"));
        		user.setEmail(resultSet.getString("email"));
        		list.add(user);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * 根据姓名查找用户信息
	 */
	public User queryUserByName(String username) {
		String sql = "select * from users where username = ?";
    	ResultSet resultSet = null;
    	User user = null;
        try {
        	resultSet = jdbcutile.selectDataBaseTable(sql,username);
        	if(resultSet.next()){
        		user = new User();
        		user.setId(resultSet.getInt("userId"));
        		user.setUserName(resultSet.getString("username"));
        		user.setPassword(resultSet.getString("password"));
        		user.setEmail(resultSet.getString("email"));
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
        		jdbcutile.dbClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}

}
