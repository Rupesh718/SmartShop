package com.smartshop.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cartId;
private int pId;
private int pPrice;
private String pName;
@ManyToOne(cascade = CascadeType.MERGE)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@JoinColumn(name ="id" , referencedColumnName = "id")
private Customer customer;
private int pQuantity;
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(int cartId, int pId, int pPrice, String pName,Customer customer, int pQuantity) //Customer customer
{
	super();
	this.cartId = cartId;
	this.pId = pId;
	this.pPrice = pPrice;
	this.pName = pName;
	this.customer = customer;
	this.pQuantity = pQuantity;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public int getpPrice() {
	return pPrice;
}
public void setpPrice(int pPrice) {
	this.pPrice = pPrice;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getpQuantity() {
	return pQuantity;
}
public void setpQuantity(int pQuantity) {
	this.pQuantity = pQuantity;
}


}
