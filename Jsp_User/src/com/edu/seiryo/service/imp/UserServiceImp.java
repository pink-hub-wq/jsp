package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService{
	UserDaoImp userDao = new UserDaoImp();
	/**
	 * 注册
	 */
	public boolean regist(User user){
		 return userDao.regist(user);
	}
	/**
	 * 登录
	 */
	public boolean login(User user){
		 return userDao.login(user);
	}
	/**
	 * 根据id查询用户
	 */
	public User queryUserListById(int id) {
		return userDao.queryUserListById(id);
	}
	/**
	 * 查询所有用户信息
	 */
	public List<User> queryAllUserList() {
		return userDao.queryAllUserList();
	}
	/**
	 * 根据id删除用户信息
	 */
	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
	/**
	 * 修改用户信息
	 */
	public boolean updateUserListById(User user) {
		return userDao.updateUserListById(user);
	}
	/**
	 * 删除所有用户信息
	 */
	public boolean deleteAll() {
		return userDao.deleteAll();
	}
}
