package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.ShopColor;

/**
 * ��Ʒ��ɫ�ӿ�
 * @author lenovo
 *
 */
public interface ShopColorDao {

	/**
	 * ���� ��Ʒ id  �� ��ɫ ���� ���Ҵ�Сͼ
	 */
	public List<ShopColor> ByShopIdAndColorGetAllInfo(int ShopId,String Color);
	
	/**
	 * ����Ʒ��ɫ�����������ɫ ͼƬ ����
	 */
	public boolean AddShopColorInfo(int ShopId,String Color,String S_Img,String B_Img);
	
	//������Ʒid��ѯ��Ʒ����
	public int ByShopIdGetShopCountInfo(int shopid);
	
	//������Ʒidɾ����Ʒ��Ϣ
	public boolean ByShopIdDelInfo(int shopid);
	
	//������Ʒ��ɫ���������Ʒid��ѯ��ɫ����
	public int ByShopIdGetCount(int shopid);
}
