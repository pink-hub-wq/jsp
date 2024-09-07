package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.DingDanBiao;

/**
 * ������ӿ�
 * @author lenovo
 *
 */
public interface DingDanBiaoDao {

	
	//���Ӷ���
	public boolean AddDingDanInfo(DingDanBiao ddb);
	
	//��ѯ�Ѹ���Ķ�������
	public int ByMyUserGetCount(String MyUser);
	
	//�����Լ����˺�id��ѯ�����Ķ�����Ϣ
	public List<DingDanBiao> ByZhuRenUserGetInfo(String ZhuRenUser);
	
	//�����Լ����˺�id��ѯ ���� ���ջ����� ����״̬����Ʒ��Ϣ
	public List<DingDanBiao> ByZhuRenUserGetAllFaHuoStateInfo(String ZhuRenUser);
	
	//��ö�������
	public int Count();
	
	
	
	
	//����UserName��ѯ����֪ͨ������
	public int ByUserNameGetDingHuoTongZhiCount(String UserName);
	
	//�����Լ���UserName��ѯ��������Ϣ
	public List<DingDanBiao> ByUserNameGetInfo(String UserName);
	
	//�����Լ���UserName��ѯ ���� ������Ϣ
	public List<DingDanBiao> ByUserGetAllStateInfo(String DingDanNumber,String UserName);
	
	//ȷ�Ϸ���
	public boolean ByDingDanNumberUpdateFaHuoInfo(String DingDanNumber);
	
	//��ѯ����ɵĶ���������Ϣ����
	public int ByUserNameGetYiWanChengInfoCount(String UserName);
	
	//ȷ���ջ�
	public boolean ByDingDanNumberQueRenShouHuo(String DingDanNumber);
	
	//�����Լ���UserName��ѯ����ɵĶ�����Ϣ
	public List<DingDanBiao> ByUserNameGetYiWanChengInfo(String UserName);
	
	//���ݶ�����Ų�ѯ ��������ɵĶ�����Ϣ
	public List<DingDanBiao> ByZhuRenUserGetAllYiWanChengStateInfo(String DingDanNumber);

	//���ӽ��
	public boolean ByUserNameAndMoneyAddMoney(String Money,String UserName);
	
	//������ж��������������
	public List<DingDanBiao> GetAllInfo();
	
	//�޸��ջ���ַ
	public boolean UpdateAddressInfo(int address,String DingDanNuber);
	
	//��� ����ɶ�������
	public int GetAllCount();
}
