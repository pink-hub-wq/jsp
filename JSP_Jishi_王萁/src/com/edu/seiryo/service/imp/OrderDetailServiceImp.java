package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.OrderDetailDao;
import com.edu.seiryo.dao.imp.OrderDetailDaoImp;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.service.OrderDetailService;

public class OrderDetailServiceImp implements OrderDetailService {
	OrderDetailDao orderDetailDao = new OrderDetailDaoImp();
	/**
	 * ���ݱ�Ų�ѯ��Ʒ��ϸ
	 */
	public List<OrderDetail> queryOrderDetailByOrderId(int orderId) {
		return orderDetailDao.queryOrderDetailByOrderId(orderId);
	}
	/**
	 * �����Ʒ��ϸ
	 */
	public boolean addOrderDetail(OrderDetail orderDetail) {
		return orderDetailDao.addOrderDetail(orderDetail);
	}

}
