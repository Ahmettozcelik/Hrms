package com.example.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.entities.Position;
import com.example.hrms.repository.PositionRepository;

@Service
public class PositionService {

	private PositionRepository positionRepository;

	@Autowired
	public PositionService(PositionRepository positionRepository) {
		this.positionRepository = positionRepository;
	}

	public List<Position> findAll() {
		return positionRepository.findAll();
	}

	public void deletePositionById(int positionId) {
		positionRepository.deleteById(positionId);
		
	}
	
}
