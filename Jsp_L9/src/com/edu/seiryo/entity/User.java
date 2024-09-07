package com.edu.seiryo.entity;

public class User {
	private String no;
	private String name;
	private String sex;
	private int age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String no, String name, String sex, int age) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
