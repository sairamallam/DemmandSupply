package com.hcl.supplymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.supplymanagementsystem.dto.SkillDto;
import com.hcl.supplymanagementsystem.service.SkillService;

@RestController
@RequestMapping("/skill")
@CrossOrigin("*")
public class SkillController {
	@Autowired
	SkillService skilService;

	@GetMapping()
	public ResponseEntity<List<SkillDto>> getSkills() {
		return new ResponseEntity<>(skilService.getSkills(), HttpStatus.OK);
	}

}
