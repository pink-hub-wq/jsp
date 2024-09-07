package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao2;
import com.edu.seiryo.dao.imp.UserDaoImp2;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService2;

public class UserServiceImp2 implements UserService2 {
	UserDao2 userDao2 = new UserDaoImp2();
	/**
	 * 登录
	 */
	public User2 login(String account,String password) {
		return userDao2.login(account,password);
	}
	/**
	 * 根据id查询用户
	 */
	public User2 queryUserListById(int id) {
		return userDao2.queryUserListById(id);
	}
	/**
	 * 查询所有用户信息
	 */
	public List<User2> queryAllUserList() {
		return userDao2.queryAllUserList();
	}
	/**
	 * 根据name删除用户信息
	 */
	public boolean deleteUserByName(String name) {
		return userDao2.deleteUserByName(name);
	}
	/**
	 * 修改用户信息
	 */
	public boolean updateUserListById(User2 user) {
		return userDao2.updateUserListById(user);
	}
	/**
	 * 删除所有用户信息
	 */
	public boolean deleteAll() {
		return userDao2.deleteAll();
	}
}
