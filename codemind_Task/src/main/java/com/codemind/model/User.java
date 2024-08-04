package com.codemind.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_Id;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name ="user_created_Date")
	private Date user_created_Date;
	
	@Column(name = "password")
	private String password;

	public long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}

	public Date getUser_created_Date() {
		return user_created_Date;
	}

	public void setUser_created_Date(Date user_created_Date) {
		this.user_created_Date = user_created_Date;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
