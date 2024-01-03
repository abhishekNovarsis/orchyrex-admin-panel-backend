package com.main.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.main.entity.User;
@Configuration
@EnableMongoRepositories(basePackages = "com.main.repository")
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByEmail(String email);

}