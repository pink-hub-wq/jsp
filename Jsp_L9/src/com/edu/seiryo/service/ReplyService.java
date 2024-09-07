package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Reply;

public interface ReplyService {
	List<Reply> queryReply(int titleId);
	boolean addReply(Reply reply);
}
