package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.ShopInfo;

/**
 * ��Ʒ�ӿ���
 * @author lenovo
 *
 */
public interface ShopInfoDao {

	public List<ShopInfo> GetUserInfoAllShop(int pageNo,int pageSize,String UserName,ShopInfo si);
	
	//��ѯ ��Ʒ����
	public int ByUserInfoGetShopCount(String UserName);
	
	//�����·����Ͳ��������·�
	public List<ShopInfo> ByShopTypeGetAllInfo(int pageNo,int pageSize,ShopInfo si);
	
	//�����·����Ͳ��Ҹ���Ʒ���͵�����
	public int ByShopTypeGetCount(ShopInfo sis);
	
	//������Ʒid������Ʒ��Ϣ
	public ShopInfo ByShopIdGetAllInfo(int ShopId);
	
	/**
	 * �����Ʒ
	 */
	public boolean AddInfoInfo(ShopInfo si);
	
	//��ѯ��Ʒid
	public int GetShopId(String shopname,String ShopMiaoShu,String ZhuRenUser);
	
	//������Ʒ����
	public boolean ByIdUpdateShopImage(int shopid,String Image);
	
	//����id��UserNameɾ����Ʒ��Ϣ
	public boolean ByIdAndUserNameDelShopInfo(int id,String UserName);
	
	//��������
	public boolean ByShopIdAddCount(int shopid,int count);
	
	//��ѯȫ����Ʒ
	public List<ShopInfo> GetAllInfo(ShopInfo si);
	
	//��ѯ��Ʒ��������
	public List<ShopInfo> GetBigShopXiaoLing();
	
	//�������Ͳ�ѯ��Ʒ��������
	public List<ShopInfo> ByTypeIdGetBigShopXiaoLing(int typeid);
	
	//������Ʒ�Ƿ��¼ܵ�״̬
	public boolean ByShopidUpdateXiaJia(int shopid,int state);
	
	//���ȫ����Ʒ����
	public int Count();
}
