package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.UserDao2;
import com.edu.seiryo.entity.User2;
import com.edu.seiryo.util.DBUtil;

/**
 * User数据处理类
 * @author WANGQI
 * @date 2024年5月24日
 * @project_name Jsp_L4
 * @package_name com.edu.seiryo.dao.imp
 * @file_name UserDaoImp2.java
 * @classname UserDaoImp2
 * @version
 */
public class UserDaoImp2 implements UserDao2 {
	DBUtil dbUtil = new DBUtil();
	/**
	 * 登录
	 */
	public User2 login(String account,String password) {
		String sql = "select userName,password from t_user where userName = ? and password = ?";
        ResultSet resultSet = null;
        User2 user = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,account,password);
        	if(resultSet.next()){
        		user = new User2(resultSet.getString("userName"),resultSet.getString("password"));
        	}
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        return user;
	}
	/**
	 * 根据id查询用户
	 */
	public User2 queryUserListById(int id) {
		User2 user = null;
		String sql = "select * from t_user where id = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,id);
        	if(resultSet.next()){
        		user = new User2();
        		user.setId(resultSet.getInt("id"));
        		user.setUserName(resultSet.getString("userName"));
        		user.setSex(resultSet.getString("sex"));
        		user.setBirthday(resultSet.getString("birthday"));
        		user.setCompany(resultSet.getString("company"));
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	/**
	 * 查询所有用户信息
	 */
	public List<User2> queryAllUserList() {
		List<User2> list = new ArrayList<User2>();
		String sql = "select id,userName,sex,birthday,company from t_user";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while(resultSet.next()){
        		User2 user = new User2();
        		user.setId(resultSet.getInt("id"));
        		user.setUserName(resultSet.getString("userName"));
        		user.setSex(resultSet.getString("sex"));
        		user.setBirthday(resultSet.getString("birthday"));
        		user.setCompany(resultSet.getString("company"));
        		list.add(user);
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * 根据name删除用户信息
	 */
	public boolean deleteUserByName(String name) {
		String sql = "delete t_user where userName = ?";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,name);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 修改用户信息
	 */
	public boolean updateUserListById(User2 user) {
		String sql = "update t_user set userName = ?, sex =?,company = ?,birthday = ? where id = ?";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,user.getUserName(),user.getSex(),user.getCompany(),user.getBirthday(),user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
	/**
	 * 删除所有用户信息
	 */
	public boolean deleteAll() {
		String sql = "delete t_user ";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	try {
				dbUtil.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bo;
	}
}
