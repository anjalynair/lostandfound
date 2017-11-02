package com.lostandfound.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Role;
	private Date Date;
	private boolean Isactive;
	private int Userid;
	
	
	@ManyToOne
	@JoinTable(name="Userid")
	private User user;
	
	
	
	
	public Role(int id, String role, java.sql.Date date, boolean isactive, int userid, User user) {
		super();
		Id = id;
		Role = role;
		Date = date;
		Isactive = isactive;
		Userid = userid;
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public boolean isIsactive() {
		return Isactive;
	}
	public void setIsactive(boolean isactive) {
		Isactive = isactive;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	
	
	
	
	public Role() {
		super();
		
	}
	

}
