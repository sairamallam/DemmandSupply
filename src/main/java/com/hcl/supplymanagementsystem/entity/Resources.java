package com.hcl.supplymanagementsystem.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Setter @Getter
public class Resources implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long resourcesId;
	private String name;
	private LocalDate dateOfJoin;
	private String email;


	
}
