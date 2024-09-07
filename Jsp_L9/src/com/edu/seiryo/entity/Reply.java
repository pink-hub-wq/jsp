package com.edu.seiryo.entity;

public class Reply {
	private int id;
	private String msg;
	private String time;
	private int titleId;
	private String account;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Reply(int id, String msg, String time, int titleId, String account) {
		super();
		this.id = id;
		this.msg = msg;
		this.time = time;
		this.titleId = titleId;
		this.account = account;
	}
	public Reply() {
		super();
	}
	@Override
	public String toString() {
		return "Reply [id=" + id + ", msg=" + msg + ", time=" + time + ", titleId=" + titleId + ", account=" + account
				+ "]";
	}
	
}
