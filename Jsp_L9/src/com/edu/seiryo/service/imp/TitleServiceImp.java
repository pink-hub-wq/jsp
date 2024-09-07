package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.TitleDao;
import com.edu.seiryo.dao.imp.TitleDaoImp;
import com.edu.seiryo.entity.Title;
import com.edu.seiryo.service.TitleService;

public class TitleServiceImp implements TitleService{
	TitleDao TitleDao = new TitleDaoImp();
	@Override
	public boolean addTitle(String title) {
		return TitleDao.addTitle(title);
	}

	@Override
	public List<Title> queryTitle() {
		return TitleDao.queryTitle();
	}

	@Override
	public Title queryTitle(int id) {
		return TitleDao.queryTitle(id);
	}

}
