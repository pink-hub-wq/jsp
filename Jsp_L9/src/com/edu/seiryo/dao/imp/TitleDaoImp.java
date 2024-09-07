package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.TitleDao;
import com.edu.seiryo.entity.Title;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.util.DBUtil;

public class TitleDaoImp implements TitleDao {
	DBUtil dbUtil = new DBUtil();
	@Override
	public boolean addTitle(String title) {
		String sql = "insert t_title values(?)";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,title);
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

	@Override
	public List<Title> queryTitle() {
		List<Title> list = new ArrayList<Title>();
		ResultSet resultSet = null;
		String sql = "select id,title from t_title";
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while (resultSet.next()) {
				Title title = new Title();
				title.setId(resultSet.getInt("id"));
				title.setTitle(resultSet.getString("title"));
				list.add(title);
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
	public Title queryTitle(int id) {
		ResultSet resultSet = null;
		Title title = null;
		String sql = "select id,title from t_title where id = ?";
        try {
        	resultSet = dbUtil.excuteQuery(sql,id);
        	if (resultSet.next()) {
				title = new Title();
				title.setId(resultSet.getInt("id"));
				title.setTitle(resultSet.getString("title"));
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
		return title;
	}

}
