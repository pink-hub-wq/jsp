package com.edu.seiryo.entity;
/**
 * 订单信息
 * @author WANGQI
 * @date 2024年7月1日
 * @project_name JSP_Jishi_王萁
 * @package_name com.edu.seiryo.entity
 * @file_name Order.java
 * @classname Order
 * @version
 */
public class Order {
	private int id;
	private String orderId;
	private String createDtm;
	private int state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCreateDtm() {
		return createDtm;
	}
	public void setCreateDtm(String createDtm) {
		this.createDtm = createDtm;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Order(int id, String orderId, String createDtm, int state) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.createDtm = createDtm;
		this.state = state;
	}
	public Order(String orderId, String createDtm, int state) {
		super();
		this.orderId = orderId;
		this.createDtm = createDtm;
		this.state = state;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", createDtm=" + createDtm + ", state=" + state + "]";
	}
	
}
