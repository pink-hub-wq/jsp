package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User;

/**
 * Userdao接口
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao
 * @file_name Userdao.java
 * @classname Userdao
 * @version
 */
public interface Userdao {
	//登录
	public User login(String account,String password);
}
