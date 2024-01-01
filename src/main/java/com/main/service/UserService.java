package com.main.service;

import com.main.entity.User;
import com.main.exception.UserException;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
