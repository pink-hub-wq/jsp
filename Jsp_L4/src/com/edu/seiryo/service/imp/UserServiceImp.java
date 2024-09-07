package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.Userdao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
/**
 * UserServiceҵ���߼�����
 * @author WANGQI
 * @date 2024��5��24��
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.service.imp
 * @file_name UserServiceImp.java
 * @classname UserServiceImp
 * @version
 */
public class UserServiceImp implements UserService{
	Userdao userdao = new UserDaoImp();
	//��¼
	public User login(String account,String password) {
		return userdao.login(account,password);
	}

}
