package com.edu.seiryo.entity;
/**
 * User实体类
 * @author WANGQI
 * @date 2024年5月27日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.entity
 * @file_name User.java
 * @classname User
 * @version
 */
public class User {
	/**
	 * 用户账号
	 */
	private String account;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户类型
	 */
	private int type;
	/**
	 * 用户在线状态
	 */
	private int online;
	/**
	 * 用户性别
	 */
	private String sex ;
	/**
	 * 用户昵称
	 */
	private String nickname;
	/**
	 * 获取用户名
	 * @return 用户名
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 设置用户名
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取密码
	 * @return 密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置密码
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取用户类型
	 * @return 用户类型
	 */
	public int getType() {
		return type;
	}
	/**
	 * 设置用户类型
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * 获取用户在线状态
	 * @return 用户在线状态
	 */
	public int getOnline() {
		return online;
	}
	/**
	 * 设置用户在线状态
	 * @param online
	 */
	public void setOnline(int online) {
		this.online = online;
	}
	/**
	 * 获取用户性别
	 * @return 用户性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置用户性别
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取用户昵称
	 * @return 用户昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置用户昵称
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 无参构造，创建对象
	 */
	public User() {
		super();
	}
	/**
	 * 有参构造，创建对象
	 * @param account
	 * @param password
	 * @param type
	 * @param online
	 * @param sex
	 * @param nickname
	 */
	public User(String account, String password, int type, int online, String sex, String nickname) {
		super();
		this.account = account;
		this.password = password;
		this.type = type;
		this.online = online;
		this.sex = sex;
		this.nickname = nickname;
	}
	/**
	 * 有参构造，创建对象
	 * @param account
	 * @param password
	 */
	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}
	/**
	 * 有参构造，创建对象
	 * @param account
	 * @param password
	 * @param sex
	 * @param nickname
	 */
	public User(String account, String password, String sex, String nickname) {
		super();
		this.account = account;
		this.password = password;
		this.sex = sex;
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", type=" + type + ", online=" + online
				+ ", sex=" + sex + ", nickname=" + nickname + "]";
	}
	
}
