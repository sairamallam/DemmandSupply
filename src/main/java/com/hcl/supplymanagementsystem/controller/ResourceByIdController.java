package com.hcl.supplymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.supplymanagementsystem.dto.ResourcesByDemandDto;
import com.hcl.supplymanagementsystem.service.ResourceByDemandService;

@RestController
@RequestMapping("/resources")
@CrossOrigin("*")
public class ResourceByIdController {
	@Autowired
	ResourceByDemandService resourceByIdService;

	@GetMapping("/{id}")
	public ResponseEntity<List<ResourcesByDemandDto>> getResources(@PathVariable Long id) {
		return new ResponseEntity<>(resourceByIdService.getResourcesByDemand(id), HttpStatus.OK);
	}

}
