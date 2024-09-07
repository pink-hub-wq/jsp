package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();
	public UserInfo login(UserInfo userInfo) {
		return userDao.login(userInfo);
	}

}
