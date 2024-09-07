package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.UserInfo;

public interface UserInfoDao {
	
	public UserInfo ByUserNameGetInfo(String UserName);
	
	public boolean UpdateInfo(UserInfo ui,String address2);
	
	/**
	 * ��ͨ����
	 */
	
	public boolean KaiTongDianPu(String shenfen,String username);
	/**
	 * �ж� �����֤�Ƿ����
	 */
	
	public UserInfo IsShenFenExist(String shenfen);
	
	/**
	 * �жϿ�ͨ���̽���Ƿ��㹻
	 */
	public boolean ByIdIsMoney(String username);
	
	//��������û�
	public List<UserInfo> GetAllInfo();
	
	//����UserNameɾ���û���Ϣ
	public boolean ByUserNameDelUserInfo(String UserName);
	
	//����UserName��ӽ��
	public boolean ByUserNameAddMoney(String UserName);
	
	//��ѯ�ֻ����Ƿ����
	public boolean ByPhoneGetAllInfo(String Phone);
}
