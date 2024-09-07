package com.edu.seiryo.entity;

public class User {
	private String no;
	private String name;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
	
}
