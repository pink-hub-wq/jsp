package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
/**
 * UserService实现类
 * @author WANGQI
 * @date 2024年5月27日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service.imp
 * @file_name UserServiceImp.java
 * @classname UserServiceImp
 * @version
 */
public class UserServiceImp implements UserService {
	UserDao userDao = new UserDaoImp();
	/**
	 * 注册
	 */
	public boolean regist(User user) {
		return userDao.regist(user);
	}
	/**
	 * 登录
	 */
	public boolean login(User user) {
		return userDao.login(user);
	}
	/**
	 * 检查用户是否曾经注册过
	 */
	public boolean isUserExist(String account) {
		return userDao.isUserExist(account);
	}
	/**
	 * 查询用户类型
	 */
	public int selectUserType(User user){
		return userDao.selectUserType(user);
	};
	/**
	 * 更新用户类型
	 */
	public boolean updateUserType(int type,String account){
		return userDao.updateUserType(type, account);
	};
	/**
	 * 更新用户在线状态
	 */
	public boolean updateUserOnline(int online,String account){
		return userDao.updateUserOnline(online, account);
	}
	/**
	 * 根据账号查询昵称
	 */
	public String selectUserNickName(String account) {
		return userDao.selectUserNickName(account);
	}
	/**
	 * 根据账号查询在线状态
	 */
	public int selectUserOnline(String account) {
		return userDao.selectUserOnline(account);
	}
	/**
	 * 根据账号查询用户性别
	 */
	public String selectUserSex(String account) {
		return userDao.selectUserSex(account);
	}
	/**
	 * 查询所有在线用户
	 */
	public List<User> selectAllUsers(int online) {
		return userDao.selectAllUsers(online);
	}
	/**
	 * 查询用户类型
	 */
	public int selectUserType(String account) {
		return userDao.selectUserType(account);
	}
	/**
	 * 更新用户在线状态
	 */
	public boolean updateUserOnline2(int online, int type) {
		return userDao.updateUserOnline2(online, type);
	};
	
}
