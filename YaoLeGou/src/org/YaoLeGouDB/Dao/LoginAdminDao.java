package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.LoginAdmin;

/**
 * ��̨������֤��
 * @author lenovo
 *
 */
public interface LoginAdminDao {

	
	//���ݺ�̨�˺ź�������֤��̨�˺��Ƿ���ȷ
	public LoginAdmin ByUserNameAndPassClickIsOk(String UserName,String Pass);
	
	//���ȫ������Ա��Ϣ
	public List<LoginAdmin> GetAllInfo();
	
	//����״̬Ϊ����
	public boolean UpdateStateWei0(String UserName);
	
	//����״̬Ϊ����
	public boolean UpdateStateWei1(String UserName);
	
	//��ӹ���Ա��Ϣ
	public boolean AddAdminInfo(LoginAdmin la);
	
	//����id��ù���Ա��Ϣ
	public LoginAdmin ByIdGetAllInfo(String UserName);
	
	//���ݹ���ԱUserName������Ϣ
	public boolean ByUserNameUpdateInfo(LoginAdmin la);
	
	//���ݹ���Ա�˺�ɾ����Ϣ
	public boolean ByUserNamedelInfo(String UserName);
	
	//����UserName��������
	public boolean ByUserNameUpdatePass(String UserName,String pass);
}
