package com.lostandfound.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
@Entity
public class UserToken {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Token;
	private Date Expirationtime;
	private int Userid;
	private boolean Isactive;
	private Date Createdtime;
	private int NumberOfAttempts;
	
	@OneToOne
	@JoinTable(name="Userid")
	private User user;
	
	
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserToken(int id, String token, Date expirationtime, int userid, boolean isactive, Date createdtime,
			int numberOfAttempts, User user) {
		super();
		Id = id;
		Token = token;
		Expirationtime = expirationtime;
		Userid = userid;
		Isactive = isactive;
		Createdtime = createdtime;
		NumberOfAttempts = numberOfAttempts;
		this.user = user;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public Date getExpirationtime() {
		return Expirationtime;
	}
	public void setExpirationtime(Date expirationtime) {
		Expirationtime = expirationtime;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public boolean isIsactive() {
		return Isactive;
	}
	public void setIsactive(boolean isactive) {
		Isactive = isactive;
	}
	public Date getCreatedtime() {
		return Createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		Createdtime = createdtime;
	}
	public int getNumberOfAttempts() {
		return NumberOfAttempts;
	}
	public void setNumberOfAttempts(int numberOfAttempts) {
		NumberOfAttempts = numberOfAttempts;
	}
	

	
	public UserToken() {
		super();
		
	}
	
	
	
	
	

}
