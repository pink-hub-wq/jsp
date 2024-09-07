package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.OrderDetail;

public interface OrderDetailService {
	/**
	 * ���ݱ�Ų�ѯ��Ʒ��ϸ
	 * @param orderId
	 * @return ��Ʒ��ϸ
	 */
	List<OrderDetail> queryOrderDetailByOrderId(int orderId);
	/**
	 * �����Ʒ��ϸ
	 * @param orderDetail
	 * @return
	 */
	boolean addOrderDetail(OrderDetail orderDetail);
}
