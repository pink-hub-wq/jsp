package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.ChatDao;
import com.edu.seiryo.dao.imp.ChatDaoImp;
import com.edu.seiryo.entity.Chat;
import com.edu.seiryo.service.ChatService;
/**
 * ChatService实现类
 * @author WANGQI
 * @date 2024年5月28日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service.imp
 * @file_name ChatServiceImp.java
 * @classname ChatServiceImp
 * @version
 */
public class ChatServiceImp implements ChatService {
	ChatDao chatDao = new ChatDaoImp();
	/**
	 * 查询所有信息
	 */
	public List<Chat> selectAllChat() {
		return chatDao.selectAllChat();
	}
	/**
	 * 新增信息
	 */
	public boolean updateChat(Chat chat) {
		return chatDao.updateChat(chat);
	}
	/**
	 * 删除所有信息
	 */
	public boolean deleteAllChat() {
		return chatDao.deleteAllChat();
	}

}
