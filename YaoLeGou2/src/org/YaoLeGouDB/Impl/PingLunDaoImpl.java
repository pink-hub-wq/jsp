package org.YaoLeGouDB.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.YaoLeGouDB.Dao.PingLunDao;
import org.YaoLeGouDB.entity.PingLun;
import org.YaoLeGouDB.entity.UserInfo;
import org.YaoLeGouDB.utils.BaseDao;

public class PingLunDaoImpl extends BaseDao implements PingLunDao {

	@Override
	public List<PingLun> ByShopIdGetAllInfo(int shopid) {
		String sql = "select * from PingLun as pl inner join UserInfo as ui on(pl.MyUser = ui.UserName) where pl.ShopId = ? order by pl.createtime desc";
		Object[] sz = {shopid};
		ResultSet rs = super.executeQuery(sql, sz);
		List<PingLun> list = new ArrayList<PingLun>();
		try {
			while(rs.next()){
				PingLun pl = new PingLun();
				pl.setContext(rs.getString("pl.context"));
				pl.setCreatetime(rs.getString("pl.createtime"));
				pl.setId(rs.getInt("pl.id"));
				pl.setMyuser(rs.getString("pl.myuser"));
				pl.setMyuserstate(rs.getInt("pl.myuserstate"));
				pl.setShopid(rs.getInt("pl.shopid"));
				pl.setUsername(rs.getString("pl.username"));
				
				UserInfo ui = new UserInfo();
				ui.setAddress(rs.getString("ui.address"));
				ui.setDianpumoney(rs.getDouble("ui.dianpumoney"));
				ui.setEmail(rs.getString("ui.email"));
				ui.setImage(rs.getString("ui.image"));
				ui.setIsdianpu(rs.getInt("ui.isdianpu"));
				ui.setJianjie(rs.getString("ui.jianjie"));
				ui.setMoney(rs.getDouble("ui.money"));
				ui.setName(rs.getString("ui.name"));
				ui.setPhone(rs.getString("ui.phone"));
				ui.setSexid(rs.getInt("ui.sexid"));
				ui.setShenfenzheng(rs.getString("ui.shenfenzheng"));
				ui.setUsername(rs.getString("ui.username"));
				ui.setUsernick(rs.getString("ui.usernick"));
				ui.setBirthday(rs.getDate("ui.birthday"));
				
				pl.setUi(ui);
				
				list.add(pl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				CloseAll(getConnection(), rs.getStatement(), rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public boolean AddPingLunInfo(PingLun pl) {
		String sql = "insert into PingLun(ShopId,UserName,Context,MyUser,CreateTime,MyUserState) values(?,?,?,?,default,1)";
		Object[] sz = {pl.getShopid(),pl.getUsername(),pl.getContext(),pl.getMyuser()};
		return super.executeUpdate(sql, sz);
	}

	public String append(PingLun pl){
		StringBuffer sb = new StringBuffer();
		if(pl.getContext() != null && !pl.getContext().equals("")){
			sb.append(" and (context like '%"+pl.getContext()+"%' or ui.usernick like '%"+pl.getContext()+"%')");
		}
		return sb.toString();
	}

	@Override
	public List<PingLun> GetAllInfo(PingLun pl) {
		String sql = "select * from PingLun as pl inner join UserInfo as ui on(pl.MyUser = ui.UserName) where 1=1 "+append(pl);
		ResultSet resultSet = null;
		List<PingLun> list = new ArrayList<PingLun>();
		try {
			resultSet = super.executeQuery(sql, null);
			while(resultSet.next()){
				PingLun pl2 = new PingLun();
				pl2.setContext(resultSet.getString("pl.context"));
				pl2.setCreatetime(resultSet.getString("pl.createtime"));
				pl2.setId(resultSet.getInt("pl.id"));
				pl2.setMyuser(resultSet.getString("pl.myuser"));
				pl2.setMyuserstate(resultSet.getInt("pl.myuserstate"));
				pl2.setShopid(resultSet.getInt("pl.shopid"));
				pl2.setUsername(resultSet.getString("pl.username"));				
				UserInfo ui = new UserInfo();
				ui.setAddress(resultSet.getString("ui.address"));
				ui.setDianpumoney(resultSet.getDouble("ui.dianpumoney"));
				ui.setEmail(resultSet.getString("ui.email"));
				ui.setImage(resultSet.getString("ui.image"));
				ui.setIsdianpu(resultSet.getInt("ui.isdianpu"));
				ui.setJianjie(resultSet.getString("ui.jianjie"));
				ui.setMoney(resultSet.getDouble("ui.money"));
				ui.setName(resultSet.getString("ui.name"));
				ui.setPhone(resultSet.getString("ui.phone"));
				ui.setSexid(resultSet.getInt("ui.sexid"));
				ui.setShenfenzheng(resultSet.getString("ui.shenfenzheng"));
				ui.setUsername(resultSet.getString("ui.username"));
				ui.setUsernick(resultSet.getString("ui.usernick"));
				ui.setBirthday(resultSet.getDate("ui.birthday"));				
				pl2.setUi(ui);				
				list.add(pl2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				CloseAll(getConnection(), resultSet.getStatement(), resultSet);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public boolean ByIdDelInfo(int id) {
		String sql = "delete from pinglun where id = ?";
		boolean bo = false;
		Object[] objects = {id};
		try {
			bo = super.executeUpdate(sql,objects);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bo;
	}

	@Override
	public int Count() {
		String sql = "select count(*) as countNumber from pinglun";
		ResultSet resultSet = null; 
		int count = 0;
		try {
			resultSet = super.executeQuery(sql, null);
			while(resultSet.next()){
				count = resultSet.getInt("countNumber");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
