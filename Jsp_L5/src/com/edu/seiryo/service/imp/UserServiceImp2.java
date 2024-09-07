package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao2;
import com.edu.seiryo.dao.imp.UserDaoImp2;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService2;

public class UserServiceImp2 implements UserService2 {
	UserDao2 userDao2 = new UserDaoImp2();
	/**
	 * ��¼
	 */
	public User2 login(String account,String password) {
		return userDao2.login(account,password);
	}
	/**
	 * ����id��ѯ�û�
	 */
	public User2 queryUserListById(int id) {
		return userDao2.queryUserListById(id);
	}
	/**
	 * ��ѯ�����û���Ϣ
	 */
	public List<User2> queryAllUserList() {
		return userDao2.queryAllUserList();
	}
	/**
	 * ����nameɾ���û���Ϣ
	 */
	public boolean deleteUserByName(String name) {
		return userDao2.deleteUserByName(name);
	}
	/**
	 * �޸��û���Ϣ
	 */
	public boolean updateUserListById(User2 user) {
		return userDao2.updateUserListById(user);
	}
	/**
	 * ɾ�������û���Ϣ
	 */
	public boolean deleteAll() {
		return userDao2.deleteAll();
	}
}
