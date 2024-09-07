package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * 
 * User业务逻辑控制
 * @author WANGQI
 */

public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);	//用户登录
	public boolean login(User user){
        return userDao.login(user);
	}
	//用户注册
	public boolean registe(User user){
		 return userDao.registe(user);
	}
}
