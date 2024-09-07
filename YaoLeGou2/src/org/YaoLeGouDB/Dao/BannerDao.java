package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.Banner;

/**
 * �ֲ����Ľӿ�
 * @author lenovo
 *
 */
public interface BannerDao {

	/**
	 * ���ȫ�������Ϣ
	 */
	
	public List<Banner> GetAllInfo();
	
	//����BannerId�޸�������
	public boolean ByBannerIdUpdateIsTingYong0(int BannerId);
	
	//����BannerId�޸�ͣ��
	public boolean ByBannerIdUpdateIsTingYong1(int BannerId);
	
	//���Bannerͼ
	public boolean AddBannerInfo(Banner banner);
	
	//����BannerIdɾ��Bannerͼ
	public boolean ByBannerIdDelBanner(String BannerId);
	
	//����BannerId��ѯURL����
	public String ByBannerIdGetImageURL(String BannerId);
}
