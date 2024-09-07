package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.GouWuChe;

public interface GouWuCheDao {

	//���빺�ﳵ
	public boolean AddGouWuCheInfo(GouWuChe gwc);
	
	//����UserName��ѯ���ﳵ��Ϣ
	public List<GouWuChe> GetAllGouWuCheInfo(String UserName);
	
	//�����˺���Ϣ��ѯ���ﳵ������
	public int GetSize(String UserName);
	
	//����UserNameɾ�����ﳵ��Ϣ
	
	public boolean ByUserNameDelInfo(String UserName,int id);
	
	//�����û�id����Ʒid��ѯ ����Ʒ�Ƿ����ղص�
	public GouWuChe ByShopIdAndUserNameIsExist(String UserName,int ShopId,String Chicun,String Color);
	
	//������Ʒ��Ϣ
	public boolean UpdateInfo(String chicun,String color,int count,String username,int shopid,int id);
	
	//����id��UserName����Ʒid���ӹ��ﳵ������
	public boolean ByIdUserNameAndShopIdUpdateCountInfojia(int id,String UserName,int ShopId,int count);
	
	//����id��UserName����Ʒid��ȥ���ﳵ������
	public boolean ByIdUserNameAndShopIdUpdateCountInfojian(int id,String UserName,int ShopId,int count);
	
	//����id��UserNameɾ�����ﳵ��Ϣ
	public boolean ByIdUserDeleteInfo(int id,String UserName);
}
