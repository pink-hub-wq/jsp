package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.Title;

public interface TitleDao {
	boolean addTitle(String title);
	List<Title> queryTitle();
	Title queryTitle(int id);
}
