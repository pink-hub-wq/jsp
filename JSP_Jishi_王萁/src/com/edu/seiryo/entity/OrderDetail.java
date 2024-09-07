package com.edu.seiryo.entity;
/**
 * ������ϸ��Ϣ
 * @author WANGQI
 * @date 2024��7��1��
 * @project_name JSP_Jishi_��ݽ
 * @package_name com.edu.seiryo.entity
 * @file_name OrderDetail.java
 * @classname OrderDetail
 * @version
 */
public class OrderDetail {
	private int id;
	private int orderId;
	private int shopId;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderDetail(int id, int orderId, int shopId, int quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.shopId = shopId;
		this.quantity = quantity;
	}
	public OrderDetail(int orderId, int shopId, int quantity) {
		super();
		this.orderId = orderId;
		this.shopId = shopId;
		this.quantity = quantity;
	}
	
	public OrderDetail() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", shopId=" + shopId + ", quantity=" + quantity + "]";
	}
	
}
