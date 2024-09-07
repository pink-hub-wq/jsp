package com.edu.seiryo.entity;
/**
 * Shopping 实体类
 * @author WANGQI
 * @date 2024年5月26日
 * @project_name Jsp_L5
 * @package_name com.edu.seiryo.entity
 * @file_name Shopping.java
 * @classname Shopping
 * @version
 */
public class Shopping {
	/**
	 * 序号
	 */
	private int id;
	/**
	 * 商品编号
	 */
	private String GoodsId;
	/**
	 * 商品名称
	 */
	private String GoodsName;
	/**
	 * 价格
	 */
	private int price;
	/**
	 * 日期
	 */
	private String date;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 获取序号
	 * @return 序号
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置序号
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取商品编号
	 * @return 商品编号
	 */
	public String getGoodsId() {
		return GoodsId;
	}
	/**
	 * 设置商品编号
	 * @param goodsId
	 */
	public void setGoodsId(String goodsId) {
		GoodsId = goodsId;
	}
	/**
	 * 获取商品名称
	 * @return 商品名称
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * 设置商品名称
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * 获取商品价格
	 * @return 商品价格
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 设置商品价格
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * 获取日期
	 * @return 日期
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 设置商品日期
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 获取商品类型
	 * @return 商品类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置商品类型
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 有参构造，创建对象
	 * @param id
	 * @param goodsId
	 * @param goodsName
	 * @param price
	 * @param date
	 * @param type
	 */
	public Shopping(int id, String goodsId, String goodsName, int price, String date, String type) {
		super();
		this.id = id;
		GoodsId = goodsId;
		GoodsName = goodsName;
		this.price = price;
		this.date = date;
		this.type = type;
	}
	/**
	 * 无参构造，创建对象
	 */
	public Shopping() {
		super();
	}
	@Override
	public String toString() {
		return "Shopping [id=" + id + ", GoodsId=" + GoodsId + ", GoodsName=" + GoodsName + ", price=" + price
				+ ", date=" + date + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GoodsId == null) ? 0 : GoodsId.hashCode());
		result = prime * result + ((GoodsName == null) ? 0 : GoodsName.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Shopping){
			Shopping Shopping = (Shopping)obj;
			if(this.getGoodsId().equals(Shopping.getGoodsId())){
				return true;
			}
		}
		return false;
	}
	public int hasCode(){
		return this.getGoodsId().hashCode();
	}
}
