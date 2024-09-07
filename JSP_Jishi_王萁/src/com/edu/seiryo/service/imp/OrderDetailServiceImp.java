package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.OrderDetailDao;
import com.edu.seiryo.dao.imp.OrderDetailDaoImp;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.service.OrderDetailService;

public class OrderDetailServiceImp implements OrderDetailService {
	OrderDetailDao orderDetailDao = new OrderDetailDaoImp();
	/**
	 * 根据编号查询商品明细
	 */
	public List<OrderDetail> queryOrderDetailByOrderId(int orderId) {
		return orderDetailDao.queryOrderDetailByOrderId(orderId);
	}
	/**
	 * 添加商品明细
	 */
	public boolean addOrderDetail(OrderDetail orderDetail) {
		return orderDetailDao.addOrderDetail(orderDetail);
	}

}
