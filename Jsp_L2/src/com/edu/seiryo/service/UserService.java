package com.edu.seiryo.service;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

public class UserService {
	UserDao userDao = new UserDao();
	//�û�ע��
	public boolean regist(User user){
		 return userDao.regist(user);
	}
	//��¼
	public boolean login(User user){
		 return userDao.login(user);
	}
}
