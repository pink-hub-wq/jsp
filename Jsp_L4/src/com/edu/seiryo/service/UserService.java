package com.edu.seiryo.service;

import com.edu.seiryo.entity.User;
/**
 * UserService接口
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.service
 * @file_name UserService.java
 * @classname UserService
 * @version
 */
public interface UserService {
	//登录
	public User login(String account,String password);
}
