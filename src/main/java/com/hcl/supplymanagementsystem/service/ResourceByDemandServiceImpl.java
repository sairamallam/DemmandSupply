package com.hcl.supplymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.supplymanagementsystem.dto.ResourcesByDemandDto;
import com.hcl.supplymanagementsystem.repository.DemandSkillRepository;

@Service
public class ResourceByDemandServiceImpl implements ResourceByDemandService {
	@Autowired
	DemandSkillRepository demanSkillRepository;

	@Override
	public List<ResourcesByDemandDto> getResourcesByDemand(Long demandId) {
		List<ResourcesByDemandDto> list=demanSkillRepository.getResourcesByDemand(demandId);
		return list;
	}

}
