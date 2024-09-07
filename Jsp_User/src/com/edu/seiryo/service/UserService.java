package com.edu.seiryo.service;
/**
 * UserService接口
 */
import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserService {
	/**
	 * 注册
	 * @param user
	 * @return true 成功/false 失败
	 */
	public boolean regist(User user);
	/**
	 * 登录
	 * @param user
	 * @return true 成功/false 失败
	 */
	public boolean login(User user);
	/**
	 * 根据id查询用户
	 * @param id
	 * @return User
	 */
	public User queryUserListById(int id);
	/**
	 * 查询所有用户信息
	 * @return List<User>
	 */
	public List<User> queryAllUserList();
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
	public boolean updateUserListById(User user);
	/**
	 * 删除所有用户信息
	 * @return true 成功/false 失败
	 */
	public boolean deleteAll() ;
}
