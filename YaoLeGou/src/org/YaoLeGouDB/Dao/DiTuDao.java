package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.DiTu;

public interface DiTuDao {

	
	//��ѯ���е�ͼ�û�
	public List<DiTu> GetAllInfo();
	
	//���ӵ�ͼ��Ϣ
	public boolean AddInfo(String address);
	
	//�ж��Ƿ����
	public boolean Isexsts(String address);
}
