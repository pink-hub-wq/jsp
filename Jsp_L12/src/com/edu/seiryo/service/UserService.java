package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserService {
	/**
	 * 检查用户名是否存在
	 * @param userName
	 * @return true 存在 /false 不存在
	 */
	boolean checkUserName(String userName);
	/**
	 * 注册
	 * @param user
	 * @return true 成功 /false 失败
	 */
	boolean regist(User user);
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return User
	 */
	User login(String userName,String password);
	/**
	 * 查看所有用户信息
	 * @return List<User>
	 */
	List<User> queryAllUser();
	/**
	 * 根据姓名查找用户信息
	 * @param username
	 * @return List<User>
	 */
	User queryUserByName(String username);
}
