package com.edu.seiryo.entity;
/**
 * Userʵ����
 * @author WANGQI
 * @date 2024��5��24��
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.entity
 * @file_name User.java
 * @classname User
 * @version
 */
public class User {
	/**
	 * �û�id
	 */
	private int id;
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * ��ȡ�û�id
	 * @return �û�id
	 */
	public int getId() {
		return id;
	}
	/**
	 * �����û�id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ�û���
	 * @return �û���
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * �����û���
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * ��ȡ�û�����
	 * @return �û�����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * �����û�����
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * �޲ι��죬��������
	 */
	public User() {
		super();
	}
	/**
	 * �вι��죬��������
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
	 * �вι��죬��������
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
