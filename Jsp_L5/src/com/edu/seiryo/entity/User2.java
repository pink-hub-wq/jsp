package com.edu.seiryo.entity;
/**
 * Userʵ����
 * @author WANGQI
 * @date 2024��5��26��
 * @project_name Jsp_L5
 * @package_name com.edu.seiryo.entity
 * @file_name User2.java
 * @classname User2
 * @version
 */
public class User2 {
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
	 * �Ա�
	 */
	private String sex;
	/**
	 * ��˾
	 */
	private String company;
	/**
	 * ����
	 */
	private String birthday;
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
	 * ��ȡ��˾��
	 * @return ��˾��
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * ���ù�˾��
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * ��ȡ����
	 * @return
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * ��������
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * �޲ι��죬��������
	 */
	public User2() {
		super();
	}
	/**
	 * �вι��죬��������
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
	 * �вι��죬��������
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
