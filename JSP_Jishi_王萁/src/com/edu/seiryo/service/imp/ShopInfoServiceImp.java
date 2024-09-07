package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.ShopInfoDao;
import com.edu.seiryo.dao.imp.ShopInfoDaoImp;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.service.ShopInfoService;

public class ShopInfoServiceImp implements ShopInfoService {
	ShopInfoDao shopInfoDao = new ShopInfoDaoImp();
	/**
	 * 根据id查询商品
	 */
	public ShopInfo queryShopInfo(int id) {
		return shopInfoDao.queryShopInfo(id);
	}
	/**
	 * 查询所有商品
	 */
	public List<ShopInfo> queryAllShopInfo() {
		return shopInfoDao.queryAllShopInfo();
	}
	/**
	 * 根据名称查询商品
	 */
	public List<ShopInfo> queryShopInfoByName(String name) {
		return shopInfoDao.queryShopInfoByName(name);
	}
	/**
	 * 根据名称查询商品id
	 */
	public int queryShopInfoIdByName(String name) {
		return shopInfoDao.queryShopInfoIdByName(name);
	}

}
