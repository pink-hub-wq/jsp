package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.ReplyDao;
import com.edu.seiryo.entity.Reply;
import com.edu.seiryo.entity.Title;
import com.edu.seiryo.util.DBUtil;

public class ReplyDaoImp implements ReplyDao {
	DBUtil dbUtil = new DBUtil();
	@Override
	public List<Reply> queryReply(int titleId) {
		List<Reply> list = new ArrayList<Reply>();
		ResultSet resultSet = null;
		String sql = "select id,msg,time,titleId,account from t_reply";
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while (resultSet.next()) {
        		Reply reply = new Reply();
				reply.setId(resultSet.getInt("id"));
				reply.setMsg(resultSet.getString("msg"));
				reply.setTime(resultSet.getString("time"));
				reply.setTitleId(resultSet.getInt("titleId"));
				reply.setAccount(resultSet.getString("account"));
				list.add(reply);
			}
        } catch (Exception e) {
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
	@Override
	public boolean addReply(Reply reply) {
		String sql = "insert into t_reply values(?,?,?,?)";
		boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql, reply.getMsg(),reply.getTime(),reply.getTitleId(),reply.getAccount());
        } catch (Exception e) {
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
