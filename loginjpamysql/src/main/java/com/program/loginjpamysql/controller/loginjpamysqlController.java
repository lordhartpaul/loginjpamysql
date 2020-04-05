package com.program.loginjpamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@ComponentScan
@Service
public class loginjpamysqlController {
	
	@Autowired
	private loginjparepository loginrepo;
	
	@Autowired
	private loginservice loginserv;
	
public Loginform getbyusername(String username)
	
	{
		
	
		return loginrepo.findOne(username);
		
	}
public Loginform getbypassword(String password)

{
	

	return loginrepo.findOne(password);
	
}
	
	@RequestMapping("/login")
	public String getLoginForm()
	{
		String s = "Accepted";
		return s;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Loginform login(@RequestBody Loginform loginForm)
	{
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		Loginform s = loginserv.getbyUsername(username);
		
		if(s.getUsername().equals(username) && s.getPassword().equals(password))
		{
			return loginserv.getbyUsername(username);
		}
		
		else
		{
			return loginserv.getbyUsername(username);
		
		
		}
	}


}
