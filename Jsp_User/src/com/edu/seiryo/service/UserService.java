package com.edu.seiryo.service;
/**
 * UserService�ӿ�
 */
import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserService {
	/**
	 * ע��
	 * @param user
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean regist(User user);
	/**
	 * ��¼
	 * @param user
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean login(User user);
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return User
	 */
	public User queryUserListById(int id);
	/**
	 * ��ѯ�����û���Ϣ
	 * @return List<User>
	 */
	public List<User> queryAllUserList();
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
	public boolean updateUserListById(User user);
	/**
	 * ɾ�������û���Ϣ
	 * @return true �ɹ�/false ʧ��
	 */
	public boolean deleteAll() ;
}
