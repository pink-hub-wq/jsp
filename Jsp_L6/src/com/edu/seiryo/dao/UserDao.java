package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.User;

/**
 * UserDao接口
 * @author WANGQI
 * @date 2024年5月27日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.dao
 * @file_name UserDao.java
 * @classname UserDao
 * @version
 */
public interface UserDao {
	/**
	 * 注册
	 * @param user
	 * @return true成功/false失败
	 */
	boolean regist(User user);
	/**
	 * 登录
	 * @param user
	 * @return true成功/false失败
	 */
	boolean login(User user);
	/**
	 * 检查用户是否曾经注册过
	 * @param account
	 * @return true 注册过/false 没注册过
	 */
	boolean isUserExist(String account);
	/**
	 * 查询用户类型
	 * @param user
	 * @return 用户类型
	 */
	int selectUserType(User user);
	/**
	 * 更新用户类型
	 * @param type
	 * @param account
	 * @return true成功/false失败
	 */
	boolean updateUserType(int type,String account);
	/**
	 * 更新用户在线状态
	 * @param online
	 * @param account
	 * @return true成功/false失败
	 */
	boolean updateUserOnline(int online,String account);
	/**
	 * 根据账号查询昵称
	 * @param account
	 * @return 昵称
	 */
	String selectUserNickName(String account);
	/**
	 * 根据账号查询在线状态
	 * @param account
	 * @return 在线状态
	 */
	int selectUserOnline(String account);
	/**
	 * 根据账号查询用户性别
	 * @param account
	 * @return 用户性别
	 */
	String selectUserSex(String account);
	/**
	 * 查询所有在线用户
	 * @param online
	 * @return 所有在线用户集合
	 */
	List<User> selectAllUsers(int online);
	/**
	 * 查询用户类型
	 * @param account
	 * @return 用户类型
	 */
	int selectUserType(String account);
	/**
	 * 更新用户在线状态
	 * @param type
	 * @param account
	 * @return true成功/false失败
	 */
	boolean updateUserOnline2(int online,int type);
}
