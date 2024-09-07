package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Order;

public interface OrderService {
	/**
	 * 查看所有订单
	 * @return 所有订单
	 */
	List<Order> queryAllOrder();
	/**
	 * 更新订单状态
	 * @param orderId
	 * @param state
	 * @return true 成功/false 失败
	 */
	boolean updateStatus(String orderId,int state);
	/**
	 * 根据订单编号查编号
	 * @param orderId
	 * @return 编号
	 */
	int queryIdByOrderId(String orderId);
	/**
	 * 根据订单编号，查询订单状态
	 * @param orderId
	 * @return
	 */
	int queryStatusByOrderId(String orderId);
	/**
	 * 添加订单
	 * @param order
	 * @return true 成功/false 失败
	 */
	boolean addOrder(Order order);
}
