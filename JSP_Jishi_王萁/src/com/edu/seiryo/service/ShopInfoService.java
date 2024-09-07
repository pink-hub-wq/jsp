package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.ShopInfo;

public interface ShopInfoService {
	/**
	 * 根据id查询商品
	 * @param id
	 * @return ShopInfo
	 */
	ShopInfo queryShopInfo(int id);
	/**
	 * 查询所有商品
	 * @return 所有商品
	 */
	List<ShopInfo> queryAllShopInfo();
	/**
	 * 根据名称查询商品
	 * @param name
	 * @return ShopInfo
	 */
	List<ShopInfo> queryShopInfoByName(String name);
	/**
	 * 根据名称查询商品id
	 * @param name
	 * @return 商品id
	 */
	int queryShopInfoIdByName(String name);
}
