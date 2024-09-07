package com.edu.seiryo.entity;
/**
 * User实体类
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.entity
 * @file_name User.java
 * @classname User
 * @version
 */
public class User {
	/**
	 * 用户id
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 获取用户id
	 * @return 用户id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置用户id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	public String getPassword() {
		return password;
	}
	/**
	 * 设置用户密码
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 无参构造，创建对象
	 */
	public User() {
		super();
	}
	/**
	 * 有参构造，创建对象
	 * @param id
	 * @param userName
	 * @param password
	 */
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	/**
	 * 有参构造，创建对象
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
