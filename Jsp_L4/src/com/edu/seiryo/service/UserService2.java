package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.entity.User2;

public interface UserService2 {
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
	 * 根据id删除用户信息
	 * @param id
	 * @return true 成功/false 失败
	 */
	public boolean deleteUserById(int id);
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
