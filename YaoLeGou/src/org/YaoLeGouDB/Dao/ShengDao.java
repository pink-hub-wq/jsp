package org.YaoLeGouDB.Dao;
/**
 * ʡ��Dao�ӿ�
 */
import java.util.List;

import org.YaoLeGouDB.entity.Sheng;

public interface ShengDao {
	
	/**
	 * ��ѯȫ����Ϣ
	 * @return
	 */
	public List<Sheng> GetAllInfo();
	
	/**
	 * ����ʡ�����Ʋ���ʡ��id
	 * @param ShengName
	 * @return
	 */
	public Sheng ByNameGatInfo(String ShengName);
}
