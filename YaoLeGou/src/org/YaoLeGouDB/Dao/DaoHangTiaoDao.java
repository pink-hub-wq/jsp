package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.DaoHangTiao;

/**
 * �������ӿ�
 * @author lenovo
 *
 */
public interface DaoHangTiaoDao {
	
	/**
	 * ��ѯȫ��������
	 * @return
	 */
	public List<DaoHangTiao> GetAllInfo();
	
	//���ݵ�����id�޸�������
	public boolean ByidUpdateStateWei0(int id);
	
	//���ݵ�����id�޸���ͣ��
	public boolean ByidUpdateStateWei1(int id);
	
	//��ӵ�����
	public boolean AddInfo(DaoHangTiao dht);
	
	//����Idɾ����������Ϣ
	public boolean ByIdDelInfo(int id);
	
	//����Id��ѯ������Ϣ
	public DaoHangTiao ByIdGetAllInfo(int id);
	
	//����Id���µ�����Ϣ
	public boolean ByIdUpdateInfo(DaoHangTiao dht);
}
