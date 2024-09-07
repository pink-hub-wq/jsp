package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.DBUtil;

/**
 * User数据处理类
 * @author WANGQI
 * @date 2024年5月27日
 * @project_name Jsp_L6
 * @package_name com.edu.seiryo.dao.imp
 * @file_name UserDaoImp.java
 * @classname UserDaoImp
 * @version
 */
public class UserDaoImp implements UserDao {
	DBUtil dbUtil = new DBUtil();
	/**
	 * 注册
	 */
	public boolean regist(User user) {
		String sql = "insert t_userInfo values(?,?,?,?,?,?)";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,user.getAccount(),user.getPassword(),user.getType(),user.getOnline(),user.getSex(),user.getNickname());
        }catch (Exception e) {
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
		String sql = "select account from t_userInfo where account = ? and password = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	resultSet = dbUtil.excuteQuery(sql,user.getAccount(),user.getPassword());
        	if(resultSet.next()){
        		bo = true;
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
        return bo;
	}
	/**
	 * 检查用户是否曾经注册过
	 * @param account
	 * @return true 注册过/false 没注册过
	 */
	public boolean isUserExist(String account){
		String sql = "select account from t_userInfo where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	resultSet = dbUtil.excuteQuery(sql,account);
        	if(resultSet.next()){
        		bo = true;
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
        return bo;
	}
	/**
	 * 查询用户类型
	 */
	public int selectUserType(User user) {
		String sql = "select type from t_userInfo where account = ? and password = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        int type = -1;
        try {
        	resultSet = dbUtil.excuteQuery(sql,user.getAccount(),user.getPassword());
        	if(resultSet.next()){
        		type = resultSet.getInt("type");
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
        return type;
	}
	/**
	 * 更新用户类型
	 */
	public boolean updateUserType(int type, String account) {
		String sql = "update t_userInfo set type = ? where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,type,account);
        }catch (Exception e) {
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
	 * 更新用户在线状态
	 */
	public boolean updateUserOnline(int online, String account) {
		String sql = "update t_userInfo set online = ? where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,online,account);
        }catch (Exception e) {
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
	 * 根据账号查询昵称
	 */
	public String selectUserNickName(String account) {
		String sql = "select nickname from t_userInfo where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        String nickname = "";
        try {
        	resultSet = dbUtil.excuteQuery(sql,account);
        	if(resultSet.next()){
        		nickname = resultSet.getString("nickname");
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
        return nickname;
	}
	/**
	 * 根据账号查询在线状态
	 */
	public int selectUserOnline(String account) {
		String sql = "select online from t_userInfo where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        int online = -1;
        try {
        	resultSet = dbUtil.excuteQuery(sql,account);
        	if(resultSet.next()){
        		online = resultSet.getInt("online");
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
        return online;
	}
	/**
	 * 根据账号查询用户性别
	 */
	public String selectUserSex(String account) {
		String sql = "select sex from t_userInfo where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        String sex = "";
        try {
        	resultSet = dbUtil.excuteQuery(sql,account);
        	if(resultSet.next()){
        		sex = resultSet.getString("sex");
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
        return sex;
	}
	/**
	 * 查询所有在线用户
	 */
	public List<User> selectAllUsers(int online) {
		List<User> list = new ArrayList<User>();
		String sql = "select nickname,account,password ,type,sex,online from t_userInfo where online = ?";
        ResultSet resultSet = null;
        try {
        	resultSet = dbUtil.excuteQuery(sql,1);
        	while(resultSet.next()){
        		User user = new User();
        		user.setNickname(resultSet.getString("nickname"));
        		user.setAccount(resultSet.getString("account"));
        		user.setPassword(resultSet.getString("password"));
        		user.setType(resultSet.getInt("type"));
        		user.setSex(resultSet.getString("sex"));
        		user.setOnline(resultSet.getInt("online"));
        		list.add(user);
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
        return list;
	}
	/**
	 * 查询用户类型
	 */
	public int selectUserType(String account) {
		String sql = "select type from t_userInfo where account = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        int type = -1;
        try {
        	resultSet = dbUtil.excuteQuery(sql,account);
        	if(resultSet.next()){
        		type = resultSet.getInt("type");
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
        return type;
	}
	/**
	 * 更新用户在线状态
	 */
	public boolean updateUserOnline2(int online, int type) {
		String sql = "update t_userInfo set online = ? where type = ?";
        ResultSet resultSet = null;
        boolean bo = false;
        try {
        	bo = dbUtil.excuteUpdate(sql,online,type);
        }catch (Exception e) {
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
