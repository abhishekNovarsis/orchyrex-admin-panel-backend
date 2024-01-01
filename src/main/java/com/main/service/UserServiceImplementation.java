package com.main.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.main.config.JwtTokenProvider;
import com.main.entity.User;
import com.main.exception.UserException;
import com.main.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	private UserRepository userRepository;
	private JwtTokenProvider jwtTokenProvider;

	public UserServiceImplementation(UserRepository userRepository, JwtTokenProvider jwtTokenProvider) {

		this.userRepository = userRepository;
		this.jwtTokenProvider = jwtTokenProvider;

	}

	@Override
	public User findUserById(Long userId) throws UserException {
		Optional<User> user = userRepository.findById(userId);

		if (user.isPresent()) {
			return user.get();
		}
		throw new UserException("user not found with id " + userId);
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		System.out.println("user service");

		// First we Get email from token
		String email = jwtTokenProvider.getEmailFromJwtToken(jwt);

		System.out.println("email" + email);

		// Now find user by email
		User user = userRepository.findByEmail(email);

		if (user == null) {
			throw new UserException("user not exist with email " + email);
		}
		System.out.println("email user" + user.getEmail());
		return user;
	}

}
