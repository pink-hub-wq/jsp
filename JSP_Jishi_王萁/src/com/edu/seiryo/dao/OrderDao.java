package com.edu.seiryo.dao;

import java.util.*;

import com.edu.seiryo.entity.Order;

public interface OrderDao {
	/**
	 * �鿴���ж���
	 * @return ���ж���
	 */
	List<Order> queryAllOrder();
	/**
	 * ���¶���״̬
	 * @param orderId
	 * @param state
	 * @return true �ɹ�/false ʧ��
	 */
	boolean updateStatus(String orderId,int state);
	/**
	 * ���ݶ�����Ų���
	 * @param orderId
	 * @return ���
	 */
	int queryIdByOrderId(String orderId);
	/**
	 * ���ݶ�����ţ���ѯ����״̬
	 * @param orderId
	 * @return
	 */
	int queryStatusByOrderId(String orderId);
	/**
	 * ��Ӷ���
	 * @param order
	 * @return true �ɹ�/false ʧ��
	 */
	boolean addOrder(Order order);
}
