package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.SHAddress;

/**
 * �ջ���ַ�ӿ�
 * @author lenovo
 *
 */
public interface SHAddressDao {

	
	//����UserName��ѯȫ���ջ���ַ
	public List<SHAddress> GetAllInfo(String UserName);
	
	//����UserName����Ĭ�ϵ�ַ
	public boolean ByUserNameAndIdUpdateInfo(String UserName,int id);
	
	//����UserName��Ĭ�ϵ�ַȡ������
	public boolean ByUserNameAndDefaultAddressCloseUpdate(String UserName);
	
	//����ջ���ַ
	public boolean AddSHAddressInfo(SHAddress sha);
	
	//ɾ���ջ���ַ
	public boolean ByIdDelInfo(int id,String UserName);
	
	//�����ջ�id��ѯ�ջ���Ϣ
	public SHAddress ByIdGetAllInfo(int id);
}
