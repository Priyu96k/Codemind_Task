package com.codemind.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.codemind.Repo.UserRepo;
import com.codemind.model.User;
import com.codemind.*;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
//	private PasswordEncoder passwordEncoder;

	@Override
	public String saveUser(User user) {
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepo.save(user);
		return "User Saved Successfully...";
	}


	@Override
	public User findbyUserName(String user_name) {
		
		return null;
	}


	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
//		this.passwordEncoder = passwordEncoder;
	}
	

}
