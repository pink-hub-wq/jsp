package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.ShouYeShop;

public interface ShouYeShopDao {

	//����id����id��ȡ��Ʒ��Ϣ
	public List<ShouYeShop> ByShopTyIdGetAllInfo(int shoptypeid);
	
	//����id������ ɾ����Ϣ
	public boolean ByIdAndTypeIdDelInfo(String id,String typeid);
	
	//�����ҳ��Ʒ��Ϣ
	public boolean AddInfo(String typeid,String shopid);
}
