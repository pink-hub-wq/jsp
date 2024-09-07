package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Chat;
/**
 * ChatService接口
 * @author WANGQI
 * @date 2024年5月28日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.service
 * @file_name ChatService.java
 * @classname ChatService
 * @version
 */
public interface ChatService {
	/**
	 * 查询所有信息
	 * @return 所有信息
	 */
	List<Chat> selectAllChat();
	/**
	 * 新增信息
	 * @return true 成功/false 失败
	 */
	boolean updateChat(Chat chat);
	/**
	 * 删除所有信息
	 * @return true 成功/false 失败
	 */
	boolean deleteAllChat();
}
