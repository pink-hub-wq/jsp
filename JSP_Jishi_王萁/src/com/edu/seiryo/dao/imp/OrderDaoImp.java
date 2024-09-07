package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.DBUtil;

public class OrderDaoImp implements OrderDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * 查看所有订单
	 */
	public List<Order> queryAllOrder() {
		String sql = "select * from tb_order";
    	ResultSet resultSet = null;
    	List<Order> list = new ArrayList<Order>();
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while(resultSet.next()){
        		Order order =new Order();
        		order.setId(resultSet.getInt("ID"));
        		order.setOrderId(resultSet.getString("orderId"));
        		order.setCreateDtm(resultSet.getString("createDtm"));
        		order.setState(resultSet.getInt("state"));
        		list.add(order);
        		
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
	 * 更新订单状态
	 */
	public boolean updateStatus(String orderId, int state) {
		String sql = "update tb_order set state = ? where orderId = ?";
		boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, state,orderId);
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
	/**
	 * 根据订单编号查编号
	 */
	public int queryIdByOrderId(String orderId) {
		String sql = "select ID from tb_order where orderId = ?";
    	ResultSet resultSet = null;
    	int id = 0;
        try {
        	resultSet = dbUtil.excuteQuery(sql,orderId);
        	if(resultSet.next()){
        		id = resultSet.getInt("ID");
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
		return id;
	}
	/**
	 * 根据订单编号，查询订单状态
	 */
	public int queryStatusByOrderId(String orderId) {
		String sql = "select state from tb_order where orderId = ?";
    	ResultSet resultSet = null;
    	int state = -1;
        try {
        	resultSet = dbUtil.excuteQuery(sql,orderId);
        	if(resultSet.next()){
        		state = resultSet.getInt("state");
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
		return state;
	}
	/**
	 * 添加订单
	 */
	public boolean addOrder(Order order) {
		String sql = "INSERT INTO tb_order (orderId, state) VALUES (?,?);";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, order.getOrderId(),order.getState());
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
