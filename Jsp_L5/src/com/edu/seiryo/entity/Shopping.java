package com.edu.seiryo.entity;
/**
 * Shopping ʵ����
 * @author WANGQI
 * @date 2024��5��26��
 * @project_name Jsp_L5
 * @package_name com.edu.seiryo.entity
 * @file_name Shopping.java
 * @classname Shopping
 * @version
 */
public class Shopping {
	/**
	 * ���
	 */
	private int id;
	/**
	 * ��Ʒ���
	 */
	private String GoodsId;
	/**
	 * ��Ʒ����
	 */
	private String GoodsName;
	/**
	 * �۸�
	 */
	private int price;
	/**
	 * ����
	 */
	private String date;
	/**
	 * ����
	 */
	private String type;
	/**
	 * ��ȡ���
	 * @return ���
	 */
	public int getId() {
		return id;
	}
	/**
	 * �������
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * ��ȡ��Ʒ���
	 * @return ��Ʒ���
	 */
	public String getGoodsId() {
		return GoodsId;
	}
	/**
	 * ������Ʒ���
	 * @param goodsId
	 */
	public void setGoodsId(String goodsId) {
		GoodsId = goodsId;
	}
	/**
	 * ��ȡ��Ʒ����
	 * @return ��Ʒ����
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * ������Ʒ����
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * ��ȡ��Ʒ�۸�
	 * @return ��Ʒ�۸�
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * ������Ʒ�۸�
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * ��ȡ����
	 * @return ����
	 */
	public String getDate() {
		return date;
	}
	/**
	 * ������Ʒ����
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * ��ȡ��Ʒ����
	 * @return ��Ʒ����
	 */
	public String getType() {
		return type;
	}
	/**
	 * ������Ʒ����
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * �вι��죬��������
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
	 * �޲ι��죬��������
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
