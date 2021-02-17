package com.former.youtestme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.former.youtestme.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByName(String name);
}
