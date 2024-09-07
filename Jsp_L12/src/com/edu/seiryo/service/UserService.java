package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserService {
	/**
	 * ����û����Ƿ����
	 * @param userName
	 * @return true ���� /false ������
	 */
	boolean checkUserName(String userName);
	/**
	 * ע��
	 * @param user
	 * @return true �ɹ� /false ʧ��
	 */
	boolean regist(User user);
	/**
	 * ��¼
	 * @param userName
	 * @param password
	 * @return User
	 */
	User login(String userName,String password);
	/**
	 * �鿴�����û���Ϣ
	 * @return List<User>
	 */
	List<User> queryAllUser();
	/**
	 * �������������û���Ϣ
	 * @param username
	 * @return List<User>
	 */
	User queryUserByName(String username);
}
