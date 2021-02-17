package com.former.youtestme.service;

import java.util.List;

import com.former.youtestme.model.User;

public interface UserService {
	
	public User findByName(String name);
	
	public List<User> getAll(); 
}
