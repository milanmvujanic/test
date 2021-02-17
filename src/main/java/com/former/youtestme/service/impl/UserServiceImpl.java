package com.former.youtestme.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.former.youtestme.model.User;
import com.former.youtestme.repository.UserRepository;
import com.former.youtestme.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

}
