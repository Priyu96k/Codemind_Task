package com.codemind.services;

import com.codemind.model.User;

public interface UserService {
	
	String saveUser(User user);
	
	User findbyUserName(String user_name);
	
}
