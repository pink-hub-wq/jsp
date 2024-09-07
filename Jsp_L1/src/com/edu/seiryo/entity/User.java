package com.edu.seiryo.entity;
/**
 * User实体类
 * @author WANGQI
 *
 */
public class User {
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String userPassword;
	/**
	 * 获取用户名
	 * @return 用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取用户密码
	 * @return 用户密码
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * 设置用户名
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * 有参构造，创建对象
	 * @param userName
	 * @param userPassword
	 */
	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	/**
	 * 无参构造，创建对象
	 */
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
}
