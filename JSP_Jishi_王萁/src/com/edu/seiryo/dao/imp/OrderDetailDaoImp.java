package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.OrderDetailDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.util.DBUtil;

public class OrderDetailDaoImp implements OrderDetailDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * 根据编号查询商品明细
	 */
	public List<OrderDetail> queryOrderDetailByOrderId(int orderId) {
		String sql = "select * from tb_orderDetail where orderId = ?";
    	ResultSet resultSet = null;
    	List<OrderDetail> list = new ArrayList<OrderDetail>();
        try {
        	resultSet = dbUtil.excuteQuery(sql,orderId);
        	while(resultSet.next()){
        		OrderDetail orderDetail =new OrderDetail();
        		orderDetail.setId(resultSet.getInt("ID"));
        		orderDetail.setOrderId(resultSet.getInt("orderId"));
        		orderDetail.setShopId(resultSet.getInt("shopId"));
        		orderDetail.setQuantity(resultSet.getInt("quantity"));
        		list.add(orderDetail);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * 添加商品明细
	 */
	public boolean addOrderDetail(OrderDetail orderDetail) {
		String sql = "INSERT INTO tb_orderDetail (orderId,shopId, quantity) VALUES (?,?,?);";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, orderDetail.getOrderId(),orderDetail.getShopId(),orderDetail.getQuantity());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}

}
