package com.edu.seiryo.dao;

import com.edu.seiryo.entity.UserInfo;

public interface UserDao {
	/**
	 * ��¼
	 * @param userInfo
	 * @return UserInfo
	 */
	UserInfo login(UserInfo userInfo);
}
