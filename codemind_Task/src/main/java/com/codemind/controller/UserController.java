package com.codemind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.model.User;
import com.codemind.services.UserServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("")
	public String saveUser(@RequestBody User user) {
		
		return userServiceImpl.saveUser(user);
	}
	

}
