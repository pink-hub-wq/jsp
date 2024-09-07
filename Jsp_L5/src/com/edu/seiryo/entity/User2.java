package com.edu.seiryo.entity;
/**
 * User实体类
 * @author WANGQI
 * @date 2024年5月26日
 * @project_name Jsp_L5
 * @package_name com.edu.seiryo.entity
 * @file_name User2.java
 * @classname User2
 * @version
 */
public class User2 {
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
	 * 性别
	 */
	private String sex;
	/**
	 * 公司
	 */
	private String company;
	/**
	 * 生日
	 */
	private String birthday;
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
	 * 获取公司名
	 * @return 公司名
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置公司名
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取生日
	 * @return
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 设置生日
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 无参构造，创建对象
	 */
	public User2() {
		super();
	}
	/**
	 * 有参构造，创建对象
	 * @param id
	 * @param userName
	 * @param sex
	 * @param company
	 * @param birthday
	 */
	public User2(int id, String userName, String sex, String company, String birthday) {
		super();
		this.id = id;
		this.userName = userName;
		this.sex = sex;
		this.company = company;
		this.birthday = birthday;
	}
	/**
	 * 有参构造，创建对象
	 * @param id
	 * @param userName
	 * @param password
	 * @param sex
	 * @param company
	 * @param birthday
	 */
	public User2(int id, String userName, String password, String sex, String company, String birthday) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.company = company;
		this.birthday = birthday;
	}
	
	public User2(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", userName=" + userName + ", password=" + password + ", sex=" + sex + ", company="
				+ company + ", birthday=" + birthday + "]";
	}
	
	
}
