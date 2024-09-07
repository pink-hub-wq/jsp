package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.UserDao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;
/**
 * 
 * User���ݴ�����
 * @author WANGQI
 */
public class UserDaoImp implements UserDao{
	DBUtil dbUtil = new DBUtil();
	/**
	 * ע��
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
	 * ����û��Ƿ�֮ǰע���
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
	 * ��¼
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
	 * ����id��ѯ�û�
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
	 * ��ѯ�����û���Ϣ
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
	 * ����idɾ���û���Ϣ
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
	 * �޸��û���Ϣ
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
	 * ɾ�������û���Ϣ
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
