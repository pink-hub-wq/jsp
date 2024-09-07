package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.ShopType;

public interface ShopTypeDao {

	
	public List<ShopType> GetAllShopTypeInfo();
	public List<ShopType> GetAllShopTypeInfo(ShopType shopType);
	//�����Ʒ����
	public boolean AddShopTypeInfo(String TypeName);
	
	//��������idɾ����Ϣ
	public boolean ByTypeIdDelInfo(String id);
	
	//����TypeId�����Ϣ
	public ShopType ByTypeIDGetAllInfo(String id);
	
	//����id�޸���Ϣ
	public boolean ByIdUpdateInfo(String id,String name);
	
	//ͳ����Ʒ���ַ����õ����
	public List<ShopType> TJTypeInfo();
}
