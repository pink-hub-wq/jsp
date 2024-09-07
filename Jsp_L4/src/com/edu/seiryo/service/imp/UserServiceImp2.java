package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao2;
import com.edu.seiryo.dao.imp.UserDaoImp2;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.service.UserService2;

public class UserServiceImp2 implements UserService2 {
	UserDao2 userDao2 = new UserDaoImp2();
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
	 * 根据id删除用户信息
	 */
	public boolean deleteUserById(int id) {
		return userDao2.deleteUserById(id);
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
