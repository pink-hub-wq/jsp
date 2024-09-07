package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.ShopInfo;

public interface ShopInfoService {
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
