package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();

	@Override
	public User2 queryUser(String account, String password) {
		return userDao.queryUser(account, password);
	}
}
