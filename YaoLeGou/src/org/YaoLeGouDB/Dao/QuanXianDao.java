package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.QuanXian;

public interface QuanXianDao{

	
	//���ݺ�̨�˺Ų�ѯȨ��
	public QuanXian ByLoginAdminGetInfo(String LoginAdmin);
	
	//���ݺ�̨����Ա���Ȩ��
	public boolean ByAdminAddInfo(String UserName,int guanli);
	
	//��ѯ���к�̨�˺ŵ�Ȩ��
	public List<QuanXian> GetAllInfo();
	
	//���ݺ�̨�˺Ÿ���״̬��Ϣ
	public boolean ByUserNameUpdateInfo(String UserName,String weizhi,String stateid);
	
	//����UserNameɾ����Ϣ
	public boolean ByUserNameDelInfo(String UserName);
}
