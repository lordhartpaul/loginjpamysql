package com.program.loginjpamysql.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loginform {
	
	
	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	public Loginform()
	{
		
	}

	public Loginform(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
