package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.entity.User2;
/**
 * UserDao�ӿ�
 * @author WANGQI
 * @date 2024��5��24��
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao
 * @file_name UserDao2.java
 * @classname UserDao2
 * @version
 */
public interface UserDao2 {
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
	 * ����idɾ���û���Ϣ
	 * @param id
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean deleteUserById(int id);
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
	public boolean deleteAll();
}
