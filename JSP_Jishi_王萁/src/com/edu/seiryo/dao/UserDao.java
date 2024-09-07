package com.edu.seiryo.dao;

import com.edu.seiryo.entity.UserInfo;

public interface UserDao {
	/**
	 * µÇÂ¼
	 * @param userInfo
	 * @return UserInfo
	 */
	UserInfo login(UserInfo userInfo);
}
