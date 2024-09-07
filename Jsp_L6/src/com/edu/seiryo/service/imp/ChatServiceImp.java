package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.ChatDao;
import com.edu.seiryo.dao.imp.ChatDaoImp;
import com.edu.seiryo.entity.Chat;
import com.edu.seiryo.service.ChatService;
/**
 * ChatServiceʵ����
 * @author WANGQI
 * @date 2024��5��28��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service.imp
 * @file_name ChatServiceImp.java
 * @classname ChatServiceImp
 * @version
 */
public class ChatServiceImp implements ChatService {
	ChatDao chatDao = new ChatDaoImp();
	/**
	 * ��ѯ������Ϣ
	 */
	public List<Chat> selectAllChat() {
		return chatDao.selectAllChat();
	}
	/**
	 * ������Ϣ
	 */
	public boolean updateChat(Chat chat) {
		return chatDao.updateChat(chat);
	}
	/**
	 * ɾ��������Ϣ
	 */
	public boolean deleteAllChat() {
		return chatDao.deleteAllChat();
	}

}
