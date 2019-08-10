package com.hcl.supplymanagementsystem.entity;

import java.io.Serializable;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity @Setter @Getter
public class Demand implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long demandId;
	private String location;
	private String experience;
	 
	@ManyToOne @JoinColumn(name = "rolesId")
	Roles roles;

}
