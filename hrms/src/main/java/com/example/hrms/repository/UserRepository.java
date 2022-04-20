package com.example.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
