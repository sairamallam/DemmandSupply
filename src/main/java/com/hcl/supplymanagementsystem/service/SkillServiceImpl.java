package com.hcl.supplymanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.supplymanagementsystem.dto.SkillDto;
import com.hcl.supplymanagementsystem.entity.Skill;
import com.hcl.supplymanagementsystem.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	SkillRepository skillRepository;

	@Override
	public List<SkillDto> getSkills() {
		List<Skill> skillList=skillRepository.findAll();
		List<SkillDto> skillDtoList=new ArrayList<SkillDto>();
		skillList.stream().forEach(p->{
			SkillDto skillDto=new SkillDto();
			BeanUtils.copyProperties(p, skillDto);
			skillDtoList.add(skillDto);
		});
		return skillDtoList;
	}

}
