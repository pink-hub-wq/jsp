package com.edu.seiryo.entity;
/**
 * Userʵ����
 * @author WANGQI
 * @date 2024��5��27��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.entity
 * @file_name User.java
 * @classname User
 * @version
 */
public class User {
	/**
	 * �û��˺�
	 */
	private String account;
	/**
	 * �û�����
	 */
	private String password;
	/**
	 * �û�����
	 */
	private int type;
	/**
	 * �û�����״̬
	 */
	private int online;
	/**
	 * �û��Ա�
	 */
	private String sex ;
	/**
	 * �û��ǳ�
	 */
	private String nickname;
	/**
	 * ��ȡ�û���
	 * @return �û���
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * �����û���
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * ��ȡ����
	 * @return ����
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * ��������
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ��ȡ�û�����
	 * @return �û�����
	 */
	public int getType() {
		return type;
	}
	/**
	 * �����û�����
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * ��ȡ�û�����״̬
	 * @return �û�����״̬
	 */
	public int getOnline() {
		return online;
	}
	/**
	 * �����û�����״̬
	 * @param online
	 */
	public void setOnline(int online) {
		this.online = online;
	}
	/**
	 * ��ȡ�û��Ա�
	 * @return �û��Ա�
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * �����û��Ա�
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * ��ȡ�û��ǳ�
	 * @return �û��ǳ�
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * �����û��ǳ�
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * �޲ι��죬��������
	 */
	public User() {
		super();
	}
	/**
	 * �вι��죬��������
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
	 * �вι��죬��������
	 * @param account
	 * @param password
	 */
	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}
	/**
	 * �вι��죬��������
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
