package com.edu.seiryo.service;

import com.edu.seiryo.entity.User;
/**
 * UserService�ӿ�
 * @author WANGQI
 * @date 2024��5��24��
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.service
 * @file_name UserService.java
 * @classname UserService
 * @version
 */
public interface UserService {
	//��¼
	public User login(String account,String password);
}
