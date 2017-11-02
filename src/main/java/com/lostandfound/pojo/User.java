package com.lostandfound.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private String PhoneNumber;
	private String EmailId;
	private String Address;
	private String Password;
	private boolean Isadmin;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isIsadmin() {
		return Isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		Isadmin = isadmin;
	}
	
	
	public User(int id, String name, String phoneNumber, String emailId, String address, String password,
			boolean isadmin) {
		super();
		Id = id;
		this.name = name;
		PhoneNumber = phoneNumber;
		EmailId = emailId;
		Address = address;
		Password = password;
		Isadmin = isadmin;
	}
	
	
	public User() {
		super();
		
	}
	
	
	

}
