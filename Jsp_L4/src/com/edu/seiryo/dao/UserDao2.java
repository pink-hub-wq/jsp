package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.entity.User2;
/**
 * UserDao接口
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao
 * @file_name UserDao2.java
 * @classname UserDao2
 * @version
 */
public interface UserDao2 {
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
	public boolean deleteAll();
}
