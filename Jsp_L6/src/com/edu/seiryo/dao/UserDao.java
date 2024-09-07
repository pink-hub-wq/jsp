package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.User;

/**
 * UserDao�ӿ�
 * @author WANGQI
 * @date 2024��5��27��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.dao
 * @file_name UserDao.java
 * @classname UserDao
 * @version
 */
public interface UserDao {
	/**
	 * ע��
	 * @param user
	 * @return true�ɹ�/falseʧ��
	 */
	boolean regist(User user);
	/**
	 * ��¼
	 * @param user
	 * @return true�ɹ�/falseʧ��
	 */
	boolean login(User user);
	/**
	 * ����û��Ƿ�����ע���
	 * @param account
	 * @return true ע���/false ûע���
	 */
	boolean isUserExist(String account);
	/**
	 * ��ѯ�û�����
	 * @param user
	 * @return �û�����
	 */
	int selectUserType(User user);
	/**
	 * �����û�����
	 * @param type
	 * @param account
	 * @return true�ɹ�/falseʧ��
	 */
	boolean updateUserType(int type,String account);
	/**
	 * �����û�����״̬
	 * @param online
	 * @param account
	 * @return true�ɹ�/falseʧ��
	 */
	boolean updateUserOnline(int online,String account);
	/**
	 * �����˺Ų�ѯ�ǳ�
	 * @param account
	 * @return �ǳ�
	 */
	String selectUserNickName(String account);
	/**
	 * �����˺Ų�ѯ����״̬
	 * @param account
	 * @return ����״̬
	 */
	int selectUserOnline(String account);
	/**
	 * �����˺Ų�ѯ�û��Ա�
	 * @param account
	 * @return �û��Ա�
	 */
	String selectUserSex(String account);
	/**
	 * ��ѯ���������û�
	 * @param online
	 * @return ���������û�����
	 */
	List<User> selectAllUsers(int online);
	/**
	 * ��ѯ�û�����
	 * @param account
	 * @return �û�����
	 */
	int selectUserType(String account);
	/**
	 * �����û�����״̬
	 * @param type
	 * @param account
	 * @return true�ɹ�/falseʧ��
	 */
	boolean updateUserOnline2(int online,int type);
}
