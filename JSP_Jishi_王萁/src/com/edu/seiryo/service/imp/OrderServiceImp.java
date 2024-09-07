package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.dao.imp.OrderDaoImp;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.service.OrderService;

public class OrderServiceImp implements OrderService {
	OrderDao orderDao = new OrderDaoImp();
	/**
	 * �鿴���ж���
	 */
	public List<Order> queryAllOrder() {
		return orderDao.queryAllOrder();
	}
	/**
	 * ���¶���״̬
	 */
	public boolean updateStatus(String orderId, int state) {
		return orderDao.updateStatus(orderId, state);
	}
	/**
	 * ���ݶ�����Ų���
	 */
	public int queryIdByOrderId(String orderId) {
		return orderDao.queryIdByOrderId(orderId);
	}
	/**
	 * ���ݶ�����ţ���ѯ����״̬
	 */
	public int queryStatusByOrderId(String orderId) {
		return orderDao.queryStatusByOrderId(orderId);
	}
	/**
	 * ��Ӷ���
	 */
	public boolean addOrder(Order order) {
		return orderDao.addOrder(order);
	}

}
