package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.Userdao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
/**
 * UserService业务逻辑控制
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.service.imp
 * @file_name UserServiceImp.java
 * @classname UserServiceImp
 * @version
 */
public class UserServiceImp implements UserService{
	Userdao userdao = new UserDaoImp();
	//登录
	public User login(String account,String password) {
		return userdao.login(account,password);
	}

}
