package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.XiaoXiTongZhi;

/**
 * ��Ϣ֪ͨ�ӿ�
 * @author lenovo
 *
 */
public interface XiaoXiTongZhiDao {

	
	//����UserName��ѯ��Ϣ֪ͨ������
	public int GetXiaoXiTongZhiCount(String UserName);
	
	//����UserName��ѯ��Ϣ֪ͨ
	public List<XiaoXiTongZhi> ByUserNameGetAllInfo(String UserName);
	
	//���ݶ����ź��Լ����˺ţ���ѯ������Ϣ
	public XiaoXiTongZhi ByDingDanNumberAndUserNameGetAllInfo(String DingDanNumber,String UserName);
	
	//���ݶ�����ź��Լ����˻��޸���Ϣ֪ͨ������Ϊ����
	public boolean UpdateXiaoXiXiongZhiWei0(String DingDanNumber,String UserName);
	
	//�����Ϣ֪ͨ
	public boolean AddXiaoXiTongZhiInfo(XiaoXiTongZhi xxtz);
}
