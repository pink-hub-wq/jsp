package com.edu.seiryo.entity;

public class User2 {
	private String account;
	private String password;
	private int type;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public User2(String account, String password, int type) {
		super();
		this.account = account;
		this.password = password;
		this.type = type;
	}
	public User2() {
		super();
	}
	@Override
	public String toString() {
		return "User2 [account=" + account + ", password=" + password + ", type=" + type + "]";
	}
	
}
