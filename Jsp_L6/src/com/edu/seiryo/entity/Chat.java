package com.edu.seiryo.entity;
/**
 * chat实体类
 * @author WANGQI
 * @date 2024年5月28日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.entity
 * @file_name Chat.java
 * @classname Chat
 * @version
 */
public class Chat {
	/**
	 * 信息id
	 */
	private int id ;
	/**
	 * 信息内容
	 */
	private String info ;
	/**
	 * 信息时间
	 */
	private String time ;
	/**
	 * 发送人
	 */
	private String sender;
	/**
	 * 信息颜色
	 */
	private String color;
	/**
	 * 获取信息id
	 * @return 信息id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置信息id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取信息内容
	 * @return 信息内容
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * 设置信息内容
	 * @param info
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * 获取信息时间
	 * @return 信息时间
	 */
	public String getTime() {
		return time;
	}
	/**
	 * 设置信息时间
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * 获取发送人
	 * @return 发送人
	 */
	public String getSender() {
		return sender;
	}
	/**
	 * 设置发送人
	 * @param sender
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	/**
	 * 获取信息颜色
	 * @return 信息颜色
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 设置信息颜色
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * 有参构造，创建对象
	 * @param id
	 * @param info
	 * @param time
	 * @param sender
	 * @param color
	 */
	public Chat(int id, String info, String time, String sender, String color) {
		super();
		this.id = id;
		this.info = info;
		this.time = time;
		this.sender = sender;
		this.color = color;
	}
	/**
	 * 有参构造，创建对象
	 * @param info
	 * @param time
	 * @param sender
	 * @param color
	 */
	public Chat(String info, String time, String sender, String color) {
		super();
		this.info = info;
		this.time = time;
		this.sender = sender;
		this.color = color;
	}
	/**
	 * 无参构造，创建对象
	 */
	public Chat() {
		super();
	}
	/**
	 * 有参构造，创建对象
	 * @param info
	 * @param sender
	 * @param color
	 */
	public Chat(String info, String sender, String color) {
		super();
		this.info = info;
		this.sender = sender;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Chat [id=" + id + ", info=" + info + ", time=" + time + ", sender=" + sender + ", color=" + color + "]";
	}
	
}
