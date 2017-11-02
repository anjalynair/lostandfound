package com.lostandfound.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.mysql.jdbc.Blob;
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private Blob Image;
	private String Description;
	private Date Founddate;
	private int Lostdate;
	private int Userid;
	private boolean Isactive;
	private int Createddate;
	private int Modifieddate;
	private String Modifiedby;
	
	
	public Item() {
		super();
		
	}
	
	
	
	public Item(int id, String name, Blob image, String description, Date founddate, int lostdate, int userid,
			boolean isactive, int createddate, int modifieddate, String modifiedby, User user) {
		super();
		Id = id;
		Name = name;
		Image = image;
		Description = description;
		Founddate = founddate;
		Lostdate = lostdate;
		Userid = userid;
		Isactive = isactive;
		Createddate = createddate;
		Modifieddate = modifieddate;
		Modifiedby = modifiedby;
		this.user = user;
	}


    @ManyToOne
    @JoinTable(name="Userid")
	private User user; 
	
	
	
	
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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Blob getImage() {
		return Image;
	}
	public void setImage(Blob image) {
		Image = image;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getFounddate() {
		return Founddate;
	}
	public void setFounddate(Date founddate) {
		Founddate = founddate;
	}
	public int getLostdate() {
		return Lostdate;
	}
	public void setLostdate(int lostdate) {
		Lostdate = lostdate;
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
	public int getCreateddate() {
		return Createddate;
	}
	public void setCreateddate(int createddate) {
		Createddate = createddate;
	}
	public int getModifieddate() {
		return Modifieddate;
	}
	public void setModifieddate(int modifieddate) {
		Modifieddate = modifieddate;
	}
	public String getModifiedby() {
		return Modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		Modifiedby = modifiedby;
	}
	
	
	
	

}
