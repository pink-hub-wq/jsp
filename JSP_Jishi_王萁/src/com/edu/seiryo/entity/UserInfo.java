package com.edu.seiryo.entity;
/**
 * 用户信息
 * @author WANGQI
 * @date 2024年7月1日
 * @project_name JSP_Jishi_王萁
 * @package_name com.edu.seiryo.entity
 * @file_name UserInfo.java
 * @classname UserInfo
 * @version
 */
public class UserInfo {
	private int id;
	private String userName;
	private String usePassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUsePassword() {
		return usePassword;
	}
	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}
	public UserInfo(int id, String userName, String usePassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.usePassword = usePassword;
	}
	public UserInfo(String userName, String usePassword) {
		super();
		this.userName = userName;
		this.usePassword = usePassword;
	}
	public UserInfo() {
		super();
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", usePassword=" + usePassword + "]";
	}
	
}
