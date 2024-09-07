package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService{
	UserDaoImp userDao = new UserDaoImp();
	/**
	 * ע��
	 */
	public boolean regist(User user){
		 return userDao.regist(user);
	}
	/**
	 * ��¼
	 */
	public boolean login(User user){
		 return userDao.login(user);
	}
	/**
	 * ����id��ѯ�û�
	 */
	public User queryUserListById(int id) {
		return userDao.queryUserListById(id);
	}
	/**
	 * ��ѯ�����û���Ϣ
	 */
	public List<User> queryAllUserList() {
		return userDao.queryAllUserList();
	}
	/**
	 * ����idɾ���û���Ϣ
	 */
	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
	/**
	 * �޸��û���Ϣ
	 */
	public boolean updateUserListById(User user) {
		return userDao.updateUserListById(user);
	}
	/**
	 * ɾ�������û���Ϣ
	 */
	public boolean deleteAll() {
		return userDao.deleteAll();
	}
}
