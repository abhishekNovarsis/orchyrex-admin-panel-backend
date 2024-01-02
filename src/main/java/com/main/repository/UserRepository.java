package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.main.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByEmail(String email);

}