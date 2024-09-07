package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.ShopInfoDao;
import com.edu.seiryo.dao.imp.ShopInfoDaoImp;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.service.ShopInfoService;

public class ShopInfoServiceImp implements ShopInfoService {
	ShopInfoDao shopInfoDao = new ShopInfoDaoImp();
	/**
	 * ����id��ѯ��Ʒ
	 */
	public ShopInfo queryShopInfo(int id) {
		return shopInfoDao.queryShopInfo(id);
	}
	/**
	 * ��ѯ������Ʒ
	 */
	public List<ShopInfo> queryAllShopInfo() {
		return shopInfoDao.queryAllShopInfo();
	}
	/**
	 * �������Ʋ�ѯ��Ʒ
	 */
	public List<ShopInfo> queryShopInfoByName(String name) {
		return shopInfoDao.queryShopInfoByName(name);
	}
	/**
	 * �������Ʋ�ѯ��Ʒid
	 */
	public int queryShopInfoIdByName(String name) {
		return shopInfoDao.queryShopInfoIdByName(name);
	}

}
