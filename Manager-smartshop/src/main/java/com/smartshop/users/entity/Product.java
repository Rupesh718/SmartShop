package com.smartshop.users.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Product {
	
	private int pId;
	private String pName;
	private double pPrice;
	private int pQuantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String pName, double pPrice, int pQuantity) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	
	

}
