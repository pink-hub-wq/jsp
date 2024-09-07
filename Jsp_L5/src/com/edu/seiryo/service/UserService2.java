package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User2;

public interface UserService2 {
	/**
	 * 登录
	 * @param account
	 * @param password
	 * @return User
	 */
	public User2 login(String account,String password);
	/**
	 * 根据id查询用户
	 * @param id
	 * @return User
	 */
	public User2 queryUserListById(int id);
	/**
	 * 查询所有用户信息
	 * @return List<User>
	 */
	public List<User2> queryAllUserList();
	/**
	 * 根据name删除用户信息
	 * @param name
	 * @return true 成功/false 失败
	 */
	public boolean deleteUserByName(String name);
	/**
	 * 修改用户信息
	 * @param user
	 * @return true 成功/false 失败
	 */
	public boolean updateUserListById(User2 user);
	/**
	 * 删除所有用户信息
	 * @return true 成功/false 失败
	 */
	public boolean deleteAll() ;
	
}
