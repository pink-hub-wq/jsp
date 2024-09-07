package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.ShopInfoDao;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.DBUtil;

public class ShopInfoDaoImp implements ShopInfoDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * ����id��ѯ��Ʒ
	 */
	public ShopInfo queryShopInfo(int id) {
		String sql = "select * from tb_shopInfo where ID=?";
    	ResultSet resultSet = null;
    	ShopInfo shopInfo = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,id);
        	if(resultSet.next()){
        		shopInfo =new ShopInfo();
        		shopInfo.setId(resultSet.getInt("ID"));
        		shopInfo.setShopId(resultSet.getString("shopId"));
        		shopInfo.setShopName(resultSet.getString("shopName"));
        		shopInfo.setPrice(resultSet.getDouble("price"));
        		shopInfo.setOldPrice(resultSet.getDouble("oldPrice"));
        		shopInfo.setDescr(resultSet.getString("descr"));
        		shopInfo.setInsertDtm(resultSet.getString("insertDtm"));
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
		return shopInfo;
	}
	/**
	 * ��ѯ������Ʒ
	 */
	public List<ShopInfo> queryAllShopInfo() {
		String sql = "select * from tb_shopInfo";
    	ResultSet resultSet = null;
    	List<ShopInfo> list = new ArrayList<ShopInfo>();
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while(resultSet.next()){
        		ShopInfo shopInfo =new ShopInfo();
        		shopInfo.setId(resultSet.getInt("ID"));
        		shopInfo.setShopId(resultSet.getString("shopId"));
        		shopInfo.setShopName(resultSet.getString("shopName"));
        		shopInfo.setPrice(resultSet.getDouble("price"));
        		shopInfo.setOldPrice(resultSet.getDouble("oldPrice"));
        		shopInfo.setDescr(resultSet.getString("descr"));
        		shopInfo.setInsertDtm(resultSet.getString("insertDtm"));
        		list.add(shopInfo);
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
	 * �������Ʋ�ѯ��Ʒ
	 */
	public List<ShopInfo> queryShopInfoByName(String name) {
		String sql = "select * from tb_shopInfo where shopName like ?";
    	ResultSet resultSet = null;
    	List<ShopInfo> list = new ArrayList<ShopInfo>();
    	String name2 = "%" + name + "%";
        try {
        	resultSet = dbUtil.excuteQuery(sql,name2);
        	while(resultSet.next()){
        		ShopInfo shopInfo =new ShopInfo();
        		shopInfo.setId(resultSet.getInt("ID"));
        		shopInfo.setShopId(resultSet.getString("shopId"));
        		shopInfo.setShopName(resultSet.getString("shopName"));
        		shopInfo.setPrice(resultSet.getDouble("price"));
        		shopInfo.setOldPrice(resultSet.getDouble("oldPrice"));
        		shopInfo.setDescr(resultSet.getString("descr"));
        		shopInfo.setInsertDtm(resultSet.getString("insertDtm"));
        		list.add(shopInfo);
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
	 * �������Ʋ�ѯ��Ʒid
	 */
	public int queryShopInfoIdByName(String name) {
		String sql = "select * from tb_shopInfo where shopName= ?";
    	ResultSet resultSet = null;
    	int id = -1;
        try {
        	resultSet = dbUtil.excuteQuery(sql,name);
        	while(resultSet.next()){
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

}
