package com.edu.seiryo.service;

import java.util.Scanner;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;

/**
 * 
 * Userҵ���߼�����
 * @author WANGQI
 */

public class UserService {
	UserDao userDao = new UserDao();
	Scanner scanner = new Scanner(System.in);	//�û���¼
	public boolean login(User user){
        return userDao.login(user);
	}
	//�û�ע��
	public boolean registe(User user){
		 return userDao.registe(user);
	}
}
