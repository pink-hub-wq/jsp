package com.edu.seiryo.service;

import com.edu.seiryo.entity.User2;

public interface UserService {
	User2 queryUser(String account,String password);
}
