package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.dao.imp.OrderDaoImp;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.service.OrderService;

public class OrderServiceImp implements OrderService {
	OrderDao orderDao = new OrderDaoImp();
	/**
	 * 查看所有订单
	 */
	public List<Order> queryAllOrder() {
		return orderDao.queryAllOrder();
	}
	/**
	 * 更新订单状态
	 */
	public boolean updateStatus(String orderId, int state) {
		return orderDao.updateStatus(orderId, state);
	}
	/**
	 * 根据订单编号查编号
	 */
	public int queryIdByOrderId(String orderId) {
		return orderDao.queryIdByOrderId(orderId);
	}
	/**
	 * 根据订单编号，查询订单状态
	 */
	public int queryStatusByOrderId(String orderId) {
		return orderDao.queryStatusByOrderId(orderId);
	}
	/**
	 * 添加订单
	 */
	public boolean addOrder(Order order) {
		return orderDao.addOrder(order);
	}

}
