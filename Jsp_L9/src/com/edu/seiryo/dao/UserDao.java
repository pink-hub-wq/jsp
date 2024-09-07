package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User2;

public interface UserDao {
	User2 queryUser(String account,String password);
}
