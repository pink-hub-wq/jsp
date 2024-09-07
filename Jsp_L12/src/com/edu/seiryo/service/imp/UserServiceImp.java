package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();
	/**
	 * 检查用户名是否存在
	 */
	public boolean checkUserName(String userName) {
		return userDao.checkUserName(userName);
	}
	/**
	 * 注册
	 */
	public boolean regist(User user) {
		return userDao.regist(user);
	}
	/**
	 * 登录
	 */
	public User login(String userName, String password) {
		return userDao.login(userName, password);
	}
	/**
	 * 查看所有用户信息
	 */
	public List<User> queryAllUser() {
		return userDao.queryAllUser();
	}
	/**
	 * 根据姓名查找用户信息
	 */
	public User queryUserByName(String username) {
		return userDao.queryUserByName(username);
	}

}
