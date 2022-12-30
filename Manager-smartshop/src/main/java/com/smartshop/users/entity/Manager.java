package com.smartshop.users.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
@Id
	private int managerId;
	private String managerUserName;
	private String managerPassword;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int managerId, String managerUserName, String managerPassword) {
		super();
		this.managerId = managerId;
		this.managerUserName = managerUserName;
		this.managerPassword = managerPassword;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerUserName() {
		return managerUserName;
	}
	public void setManagerUserName(String managerUserName) {
		this.managerUserName = managerUserName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	
}
