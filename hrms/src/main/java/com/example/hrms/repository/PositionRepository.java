package com.example.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Integer>{

}
