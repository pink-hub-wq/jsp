package org.YaoLeGouDB.Dao;

import org.YaoLeGouDB.entity.User;

public interface UserDao {
	
	public User ClickLogin(User u);
	
	public boolean AddUserNameInfo(User u);
	
	//����״̬Ϊ0����
	public boolean UpdateStateWei0(String UserName);
	
	//����״̬Ϊ1ͣ��
	public boolean UpdateStateWei1(String UserName);
	
	//����UserName��ѯͣ��״̬
	public int ByUserNameGetStateInfo(String UserName);
	
	//��ѯ�̳����û���
	public int Count();
	
	//����UserNameɾ���û���Ϣ
	public boolean ByUserNameDelUserInfo(String UserName);
	
	//����UserName�޸�����
	public boolean ByUserNameUpdatePass(String UserName,String Pass);
}
