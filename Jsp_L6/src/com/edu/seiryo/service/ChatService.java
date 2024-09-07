package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Chat;
/**
 * ChatService�ӿ�
 * @author WANGQI
 * @date 2024��5��28��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service
 * @file_name ChatService.java
 * @classname ChatService
 * @version
 */
public interface ChatService {
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
