package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.JiBenInfo;

/**
 * ������Ϣ�ӿ�
 * @author lenovo
 *
 */
public interface JiBenInfoDao {

	/**
	 * ��ѯȫ������վ�ϵĻ�����Ϣ
	 * @return
	 */
	public List<JiBenInfo> GetAllInfo();
	
	//����keyֵ����value
	public boolean ByKeyUpdateContext(String key,String value);
	
	//�޸�ͳ��
	public boolean UpdateTongJi(String key,String value,String yuan);
	
}