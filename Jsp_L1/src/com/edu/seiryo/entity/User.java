package com.edu.seiryo.entity;
/**
 * Userʵ����
 * @author WANGQI
 *
 */
public class User {
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * ����
	 */
	private String userPassword;
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
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * �����û���
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * �вι��죬��������
	 * @param userName
	 * @param userPassword
	 */
	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	/**
	 * �޲ι��죬��������
	 */
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
}
