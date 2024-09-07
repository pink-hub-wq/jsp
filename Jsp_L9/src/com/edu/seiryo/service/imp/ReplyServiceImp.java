package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.ReplyDao;
import com.edu.seiryo.dao.imp.ReplyDaoImp;
import com.edu.seiryo.entity.Reply;
import com.edu.seiryo.service.ReplyService;

public class ReplyServiceImp implements ReplyService {
	ReplyDao replyDao = new ReplyDaoImp();
	@Override
	public List<Reply> queryReply(int titleId) {
		return replyDao.queryReply(titleId);
	}
	@Override
	public boolean addReply(Reply reply) {
		return replyDao.addReply(reply);
	}

}
