package com.example.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.entities.Position;
import com.example.hrms.service.PositionService;

@RestController
@RequestMapping("/api/v1")
public class PositionsController {

	private PositionService positionService;

	@Autowired
	public PositionsController(PositionService positionService) {
		this.positionService = positionService;
	}
	
	@GetMapping("/positions")
	public List<Position> findAllPositions(){
		return positionService.findAll();
	}
	
	@DeleteMapping
	public void deletePosition(int positionId) {
		positionService.deletePositionById(positionId);
	}
	
}
