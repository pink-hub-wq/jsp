package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Chat;
/**
 * ChatDao�ӿ�
 * @author WANGQI
 * @date 2024��5��28��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.dao
 * @file_name ChatDao.java
 * @classname ChatDao
 * @version
 */
public interface ChatDao {
	/**
	 * ��ѯ������Ϣ
	 * @return ������Ϣ
	 */
	List<Chat> selectAllChat();
	/**
	 * ������Ϣ
	 * @return true �ɹ�/false ʧ��
	 */
	boolean updateChat(Chat chat);
	/**
	 * ɾ��������Ϣ
	 * @return true �ɹ�/false ʧ��
	 */
	boolean deleteAllChat();
}
