package com.example.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.entities.User;
import com.example.hrms.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userService.findAll();
	}

	@PostMapping
	public User createUser(@RequestBody User newUser) {
		return userService.save(newUser);
	}

	@GetMapping("/users/{id}")
	public User getOneUser(@PathVariable int id) {
		return userService.findById(id);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(int id) {
		userService.deleteUserById(id);
	}

}
