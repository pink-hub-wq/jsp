package org.YaoLeGouDB.Dao;

import java.util.List;

import org.YaoLeGouDB.entity.City;

/**
 * �нӿ�
 * @author lenovo
 *
 */
public interface CityDao {

	public List<City> ByShengIdGetAllInfo(int ShengId);
	
	/**
	 * ����������ȡid
	 * @param CityName
	 * @return
	 */
	public City ByCityNameGetId(String CityName);
}
