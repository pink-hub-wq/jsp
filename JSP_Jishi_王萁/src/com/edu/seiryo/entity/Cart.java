package com.edu.seiryo.entity;

public class Cart {
	private int id;
	private String shomName;
	private float price;
	private int number;
	private float totalPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShomName() {
		return shomName;
	}
	public void setShomName(String shomName) {
		this.shomName = shomName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart(int id, String shomName, float price, int number, float totalPrice) {
		super();
		this.id = id;
		this.shomName = shomName;
		this.price = price;
		this.number = number;
		this.totalPrice = totalPrice;
	}
	public Cart(String shomName, float price, int number, float totalPrice) {
		super();
		this.shomName = shomName;
		this.price = price;
		this.number = number;
		this.totalPrice = totalPrice;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", shomName=" + shomName + ", price=" + price + ", number=" + number + ", totalPrice="
				+ totalPrice + ", allTotalPrice=" + "]";
	}
	
}
