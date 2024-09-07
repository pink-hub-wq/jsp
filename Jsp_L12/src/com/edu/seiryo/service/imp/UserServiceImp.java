package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();
	/**
	 * ����û����Ƿ����
	 */
	public boolean checkUserName(String userName) {
		return userDao.checkUserName(userName);
	}
	/**
	 * ע��
	 */
	public boolean regist(User user) {
		return userDao.regist(user);
	}
	/**
	 * ��¼
	 */
	public User login(String userName, String password) {
		return userDao.login(userName, password);
	}
	/**
	 * �鿴�����û���Ϣ
	 */
	public List<User> queryAllUser() {
		return userDao.queryAllUser();
	}
	/**
	 * �������������û���Ϣ
	 */
	public User queryUserByName(String username) {
		return userDao.queryUserByName(username);
	}

}
