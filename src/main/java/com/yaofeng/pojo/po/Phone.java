package com.yaofeng.pojo.po;

public class Phone {
	private String phoneName;
	private Integer price;
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Phone() {
		super();
	}
	public Phone(String phoneName, Integer price) {
		super();
		this.phoneName = phoneName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", price=" + price + "]";
	}
	
}
