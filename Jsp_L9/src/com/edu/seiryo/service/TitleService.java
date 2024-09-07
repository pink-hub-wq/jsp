package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.Title;

public interface TitleService {
	boolean addTitle(String title);
	List<Title> queryTitle();
	Title queryTitle(int id);
}
