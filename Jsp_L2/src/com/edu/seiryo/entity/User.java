package com.edu.seiryo.entity;
/**
 * Userʵ����
 * @author WANGQI
 *
 */
public class User {
	private String account;
	private String password;
	private String sex;
	private String email;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String account, String password, String sex, String email) {
		super();
		this.account = account;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}
	public User() {
		super();
	}
	public User(String account2, String password2) {
		this.account = account2;
		this.password = password2;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", sex=" + sex + ", email=" + email + "]";
	}
	
}
