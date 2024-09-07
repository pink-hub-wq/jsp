package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
/**
 * UserServiceʵ����
 * @author WANGQI
 * @date 2024��5��27��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service.imp
 * @file_name UserServiceImp.java
 * @classname UserServiceImp
 * @version
 */
public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();
	/**
	 * ע��
	 */
	public boolean regist(User user) {
		return userDao.regist(user);
	}
	/**
	 * ��¼
	 */
	public boolean login(User user) {
		return userDao.login(user);
	}
	/**
	 * ����û��Ƿ�����ע���
	 */
	public boolean isUserExist(String account) {
		return userDao.isUserExist(account);
	}
	/**
	 * ��ѯ�û�����
	 */
	public int selectUserType(User user){
		return userDao.selectUserType(user);
	};
	/**
	 * �����û�����
	 */
	public boolean updateUserType(int type,String account){
		return userDao.updateUserType(type, account);
	};
	/**
	 * �����û�����״̬
	 */
	public boolean updateUserOnline(int online,String account){
		return userDao.updateUserOnline(online, account);
	}
	/**
	 * �����˺Ų�ѯ�ǳ�
	 */
	public String selectUserNickName(String account) {
		return userDao.selectUserNickName(account);
	}
	/**
	 * �����˺Ų�ѯ����״̬
	 */
	public int selectUserOnline(String account) {
		return userDao.selectUserOnline(account);
	}
	/**
	 * �����˺Ų�ѯ�û��Ա�
	 */
	public String selectUserSex(String account) {
		return userDao.selectUserSex(account);
	}
	/**
	 * ��ѯ���������û�
	 */
	public List<User> selectAllUsers(int online) {
		return userDao.selectAllUsers(online);
	}
	/**
	 * ��ѯ�û�����
	 */
	public int selectUserType(String account) {
		return userDao.selectUserType(account);
	}
	/**
	 * �����û�����״̬
	 */
	public boolean updateUserOnline2(int online, int type) {
		return userDao.updateUserOnline2(online, type);
	};
	
}
