package com.program.loginjpamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginservice {
	
	@Autowired
	private loginjparepository loginrepo;
	
	public Loginform getbyUsername(String username)
	{
		return loginrepo.findOne(username);
	}
	
	public Loginform getbyPassword(String password)
	{
		return loginrepo.findOne(password);
	}
	
}
