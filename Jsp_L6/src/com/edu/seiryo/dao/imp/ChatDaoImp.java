package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.ChatDao;
import com.edu.seiryo.entity.Chat;
import com.edu.seiryo.util.DBUtil;
/**
 * ChatDaoʵ����
 * @author WANGQI
 * @date 2024��5��28��
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.dao.imp
 * @file_name ChatDaoImp.java
 * @classname ChatDaoImp
 * @version
 */
public class ChatDaoImp implements ChatDao{
	DBUtil dbUtil = new DBUtil();
	/**
	 * ��ѯ������Ϣ
	 */
	public List<Chat> selectAllChat() {
		List<Chat> list = new ArrayList<Chat>();
		String sql = "select id,info,sender,time,color from t_chat";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while(resultSet.next()){
        		Chat chat = new Chat();
        		chat.setId(resultSet.getInt("id"));
        		chat.setInfo(resultSet.getString("info"));
        		chat.setSender(resultSet.getString("sender"));
        		chat.setTime(resultSet.getString("time"));
        		chat.setColor(resultSet.getString("color"));
        		list.add(chat);
        	}
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return list;
	}
	/**
	 * ������Ϣ
	 */
	public boolean updateChat(Chat chat) {
		String sql = "insert t_chat values(?,?,?,?)";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,chat.getInfo(),chat.getTime(),chat.getSender(),chat.getColor());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return bo;	
	}
	/**
	 * ɾ��������Ϣ
	 */
	public boolean deleteAllChat() {
		String sql = "delete from t_chat ";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return bo;	
	}

}
