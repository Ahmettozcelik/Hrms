package com.example.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.entities.User;
import com.example.hrms.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User newUser) {
		return userRepository.save(newUser);
	}

	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}

}
