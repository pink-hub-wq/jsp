package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.UserDao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * 
 * User数据处理类
 * @author WANGQI
 */
public class UserDaoImp implements UserDao{
	DBUtil dbUtil = new DBUtil();
	/**
	 * 注册
	 */
	public boolean regist(User user) {
		String sql = "insert into userList values (?, ?)";
    	boolean bo = false;
    	if(isUserExist(user)){
    		return bo;
    	}
        try {
        	bo = dbUtil.excuteUpdate(sql, user.getUserName(),user.getPassword());
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
	 * 检查用户是否之前注册过
	 * @param user
	 * @return
	 */
	private boolean isUserExist(User user){
		String sql = "select * from userList where userName = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getUserName());
        	if(resultSet.next()){
        		bo = true;
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
		return bo;
	}
	/**
	 * 登录
	 */
	public boolean login(User user) {
		String sql = "select id from userList where userName = ? and password = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql, user.getUserName(),user.getPassword());
        	if(resultSet.next()){
        		bo = true;
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
		return bo;
	}
	/**
	 * 根据id查询用户
	 */
	public User queryUserListById(int id) {
		User user = null;
		String sql = "select * from userList where id = ?";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,id);
        	if(resultSet.next()){
        		user = new User();
        		user.setId(resultSet.getInt("id"));
        		user.setUserName(resultSet.getString("userName"));
        		user.setPassword(resultSet.getString("password"));
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
	public List<User> queryAllUserList() {
		List<User> list = new ArrayList<User>();
		String sql = "select id,userName,password from userList";
    	boolean bo = false;
    	ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql);
        	while(resultSet.next()){
        		User user = new User();
        		user.setId(resultSet.getInt("id"));
        		user.setUserName(resultSet.getString("userName"));
        		user.setPassword(resultSet.getString("password"));
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
	 * 根据id删除用户信息
	 */
	public boolean deleteUserById(int id) {
		String sql = "delete userList where id = ?";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,id);
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
	public boolean updateUserListById(User user) {
		String sql = "update userList set userName = ?, password =? where id = ?";
    	boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,user.getUserName(),user.getPassword(),user.getId());
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
		String sql = "delete userList ";
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
