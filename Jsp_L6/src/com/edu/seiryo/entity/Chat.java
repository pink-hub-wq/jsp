package com.edu.seiryo.entity;
/**
 * chatʵ����
 * @author WANGQI
 * @date 2024��5��28��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.entity
 * @file_name Chat.java
 * @classname Chat
 * @version
 */
public class Chat {
	/**
	 * ��Ϣid
	 */
	private int id ;
	/**
	 * ��Ϣ����
	 */
	private String info ;
	/**
	 * ��Ϣʱ��
	 */
	private String time ;
	/**
	 * ������
	 */
	private String sender;
	/**
	 * ��Ϣ��ɫ
	 */
	private String color;
	/**
	 * ��ȡ��Ϣid
	 * @return ��Ϣid
	 */
	public int getId() {
		return id;
	}
	/**
	 * ������Ϣid
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ��Ϣ����
	 * @return ��Ϣ����
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * ������Ϣ����
	 * @param info
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * ��ȡ��Ϣʱ��
	 * @return ��Ϣʱ��
	 */
	public String getTime() {
		return time;
	}
	/**
	 * ������Ϣʱ��
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * ��ȡ������
	 * @return ������
	 */
	public String getSender() {
		return sender;
	}
	/**
	 * ���÷�����
	 * @param sender
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	/**
	 * ��ȡ��Ϣ��ɫ
	 * @return ��Ϣ��ɫ
	 */
	public String getColor() {
		return color;
	}
	/**
	 * ������Ϣ��ɫ
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * �вι��죬��������
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
	 * �вι��죬��������
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
	 * �޲ι��죬��������
	 */
	public Chat() {
		super();
	}
	/**
	 * �вι��죬��������
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
