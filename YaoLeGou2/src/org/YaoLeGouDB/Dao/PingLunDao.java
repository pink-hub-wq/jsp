package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.PingLun;

/**
 * ���۽ӿ�
 * @author lenovo
 *
 */
public interface PingLunDao {

	
	//����ShopId��ѯ�ļ���Ʒ������
	public List<PingLun> ByShopIdGetAllInfo(int shopid);
	
	//��������
	public boolean AddPingLunInfo(PingLun pl);
	
	//���ȫ������
	public List<PingLun> GetAllInfo(PingLun pl);
	
	//����idɾ����Ϣ
	public boolean ByIdDelInfo(int id);
	
	//�����������
	public int Count();
}
