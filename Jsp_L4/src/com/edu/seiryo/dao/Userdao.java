package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User;

/**
 * Userdao�ӿ�
 * @author WANGQI
 * @date 2024��5��24��
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao
 * @file_name Userdao.java
 * @classname Userdao
 * @version
 */
public interface Userdao {
	//��¼
	public User login(String account,String password);
}
