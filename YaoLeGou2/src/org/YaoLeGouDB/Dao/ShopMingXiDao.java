package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.ShopMingXi;

/**
 * ��Ʒ��ϸ�ӿ�
 * @author lenovo
 *
 */
public interface ShopMingXiDao {

	public List<ShopMingXi> ByShopIdGetShopImgInfo(int ShopId);
	
	/**
	 * ����Ʒ��ϸ�������������
	 */
	public boolean AddShopMingXiInfo(int ShopId,String SImg,String BImg);
	
	//������Ʒid��ѯ��Ʒ��ϸ�����������
	public int ByShopIdGetInfoCount(int shopid);
	
	//����ϸ�������������
	public boolean AddMingXiInfo(ShopMingXi smx);
	
	//������Ʒidɾ����Ϣ
	public boolean ByShopIdDelInfo(int id);
}
