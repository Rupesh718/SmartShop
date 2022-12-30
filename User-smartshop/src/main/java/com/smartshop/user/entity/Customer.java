package com.smartshop.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
//@NotNull(message = "First Name is mandatory")
	private String first_Name;
//@NotNull(message = "Last Name is mandatory")
	private String last_Name;
//@NotNull(message = "user Name is mandatory")
	private String userName;
//@NotNull(message = "Email Id is mandatory")
	private String emailId;
//@NotNull(message = "City is mandatory")
	private String city;
//@NotNull(message = "pincode is mandatory")
	private int pincode;
//@NotNull(message = "state is mandatory")
	private String state;
//@NotNull(message = "password is mandatory")
	private String password;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String first_Name, String last_Name,String userName  ,String emailId, String city, int pincode, String state,
			String password) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.userName = userName;
		this.emailId = emailId;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	

}
