package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Reply;

public interface ReplyDao {
	List<Reply> queryReply(int titleId);
	boolean addReply(Reply reply);
}
