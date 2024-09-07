package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User2;

public interface UserService2 {
	/**
	 * ��¼
	 * @param account
	 * @param password
	 * @return User
	 */
	public User2 login(String account,String password);
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return User
	 */
	public User2 queryUserListById(int id);
	/**
	 * ��ѯ�����û���Ϣ
	 * @return List<User>
	 */
	public List<User2> queryAllUserList();
	/**
	 * ����nameɾ���û���Ϣ
	 * @param name
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean deleteUserByName(String name);
	/**
	 * �޸��û���Ϣ
	 * @param user
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean updateUserListById(User2 user);
	/**
	 * ɾ�������û���Ϣ
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean deleteAll() ;
	
}
