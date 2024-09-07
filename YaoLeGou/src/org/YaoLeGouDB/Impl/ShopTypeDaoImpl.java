package org.YaoLeGouDB.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.YaoLeGouDB.Dao.ShopTypeDao;
import org.YaoLeGouDB.entity.ShopInfo;
import org.YaoLeGouDB.entity.ShopType;
import org.YaoLeGouDB.utils.BaseDao;

public class ShopTypeDaoImpl extends BaseDao implements ShopTypeDao {

	

	@Override
	public List<ShopType> TJTypeInfo() {
		String sql = "select count(*) as c,si.shoptypeid,st.shoptypename from shopinfo as si inner join _ShopType as st on(si.shoptypeid = st.shoptypeid) group by si.shoptypeid";
		ResultSet rs = super.executeQuery(sql, null);
		List<ShopType> list = new ArrayList<ShopType>();
		try {
			while(rs.next()){
				ShopType st = new ShopType();
				st.setShoptypename(rs.getString("st.shoptypename"));
				st.setCount(rs.getInt("c"));
				
				ShopInfo si = new ShopInfo();
				si.setShoptypeid(rs.getShort("si.shoptypeid"));
				st.setSi(si);
				
				list.add(st);
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
	public String append(ShopType shopType){
		//声明超级字符串
		StringBuffer sb = new StringBuffer();
		if(shopType.getShoptypeid() != 0){
			sb.append(" and shoptypeid = "+shopType.getShoptypeid());
		}
		if(shopType.getShoptypename() != null && !shopType.getShoptypename().equals("")){
			sb.append(" or shoptypename like '%"+ shopType.getShoptypename() + "%'");
		}
		//返回一个字符串类型的
		return sb.toString();
	}
	@Override
	public List<ShopType> GetAllShopTypeInfo() {
		String sql = "select * from _ShopType";
		ResultSet  resultSet = null; 
		List<ShopType> list = new ArrayList<ShopType>();
		try {
			resultSet = super.executeQuery(sql, null);
			while(resultSet.next()){
				ShopType shopType = new ShopType();
				shopType.setShoptypeid(resultSet.getInt("shoptypeid"));
				shopType.setShoptypename(resultSet.getString("shoptypename"));
				list.add(shopType);
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
	public List<ShopType> GetAllShopTypeInfo(ShopType shopType) {
		String sql = "select * from _ShopType where 1=1" + append(shopType);
		ResultSet  resultSet = null; 
		List<ShopType> list = new ArrayList<ShopType>();
		System.out.println(sql);
		try {
			resultSet = super.executeQuery(sql, null);
			while(resultSet.next()){
				ShopType shopType1 = new ShopType();
				shopType1.setShoptypeid(resultSet.getInt("shoptypeid"));
				shopType1.setShoptypename(resultSet.getString("shoptypename"));
				list.add(shopType1);
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
	public boolean AddShopTypeInfo(String TypeName) {
		String sql = "insert into _ShopType(SHopTypeName) values(?)";
		Object[] objects = {TypeName};
		boolean bo = false;
		try {
			bo = super.executeUpdate(sql, objects);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseAll(getConnection(), null, null);
		}
		return bo;
	}

	@Override
	public boolean ByTypeIdDelInfo(String id) {
		String sql = "delete from _ShopType where shoptypeid = ?";
		Object[] objects = {id};
		boolean bo = false;
		try {
			bo = super.executeUpdate(sql, objects);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseAll(getConnection(), null, null);
		}
		return bo;
	}

	@Override
	public ShopType ByTypeIDGetAllInfo(String id) {
		String sql = "select * from _ShopType where shoptypeid = ?";
		Object[] objects = {id};
		ResultSet resultSet = null ;
		ShopType shopType = null;
		try {
			resultSet = super.executeQuery(sql, objects);
			while(resultSet.next()){
				shopType = new ShopType();
				shopType.setShoptypeid(resultSet.getInt("shoptypeid"));
				shopType.setShoptypename(resultSet.getString("shoptypename"));
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
		return shopType;
	}

	@Override
	public boolean ByIdUpdateInfo(String id, String name) {
		String sql = "update _shoptype set shoptypename = ? where shoptypeid = ?";
		Object[] objects = {name,id};
		boolean bo = false;
		try {
			bo = super.executeUpdate(sql, objects);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			CloseAll(getConnection(), null, null);
		}
		return bo;
	}

}
