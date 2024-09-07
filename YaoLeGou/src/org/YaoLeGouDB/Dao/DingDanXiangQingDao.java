package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.DingDanXiangQing;

/**
 * ��������ӿ�
 * @author lenovo
 *
 */
public interface DingDanXiangQingDao {

	
	//��Ӷ���������Ʒ��¼
	public boolean AddDingDanXingQingInfo(DingDanXiangQing ddxq);
	
	//���ݶ�����Ų�ѯ������Ʒ��¼
	public List<DingDanXiangQing> GetAllInfo(String DingDanNumber);
	
	//����UserName��ѯ�����������
	public int ByUserNameGetCount(String UserName);
	
	//���ݸ���MyUser��ѯ���ж���δ֧������Ϣ
	public List<DingDanXiangQing> ByMyUserGeAllInfo(String MyUser);
	
	//���ݶ�����Ų�ѯ ������Ϣ
	public List<DingDanXiangQing> ByUserNameAndDingDanNumberGetInfo(String UserName,String DingDanNumber);
	
	//����MyUser��UserName���������Ϣ
	public List<DingDanXiangQing> ByMyUserAndUserNameGetAllInfo(String MyUser,String DingDanNumber);
	
	//���ݶ����˺��޸Ĵ�����״̬
	public boolean ByDingDanNumberUpdateStateInfo(String DingDanNumber);
	
	//�޸Ķ�������״̬idΪ�ȴ�����
	public boolean ByDingDanNumberUpdateStateidWei1(String DingDanNumber);
	
	//�޸Ķ�������״̬idΪ���ڷ���
	public boolean ByDingDanNumberUpdateStateidWei2(String DingDanNumber,String UserName);
	
	//�޸Ķ�������״̬idΪ�������
	public boolean ByDingDanNumberUpdateStateidWei3(String DingDanNumber);
	
	//���ݶ����Ų�ѯ���������Ƿ���������
	public boolean ByDingDanNumberGetInfo(String DingDanNumber);
	
	//����������
	public int DaiFaHuoCount();
	
	//����������
	public int DaiFuKuanCount();
}
