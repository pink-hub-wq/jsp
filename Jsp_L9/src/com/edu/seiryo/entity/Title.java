package com.edu.seiryo.entity;

public class Title {
	private int id;
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Title(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Title() {
		super();
	}
	@Override
	public String toString() {
		return "Title [id=" + id + ", title=" + title + "]";
	}
	
}
