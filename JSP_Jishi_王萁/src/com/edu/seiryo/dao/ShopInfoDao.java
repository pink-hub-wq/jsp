package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.ShopInfo;

public interface ShopInfoDao {
	/**
	 * ����id��ѯ��Ʒ
	 * @param id
	 * @return ShopInfo
	 */
	ShopInfo queryShopInfo(int id);
	/**
	 * ��ѯ������Ʒ
	 * @return ������Ʒ
	 */
	List<ShopInfo> queryAllShopInfo();
	/**
	 * �������Ʋ�ѯ��Ʒ
	 * @param name
	 * @return ShopInfo
	 */
	List<ShopInfo> queryShopInfoByName(String name);
	/**
	 * �������Ʋ�ѯ��Ʒid
	 * @param name
	 * @return ��Ʒid
	 */
	int queryShopInfoIdByName(String name);
}
