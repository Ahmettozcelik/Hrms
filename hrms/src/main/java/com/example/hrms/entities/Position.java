package com.example.hrms.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="positions")
@JsonIgnoreProperties({"hibernateLazyInitilaizer","handler","users"})
public class Position {

	@Id
	@Column(name = "position_id")
	private int positionId;
	
	@Column(name = "position_name")
	private String positionName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
	private List<User> users;
	
}
