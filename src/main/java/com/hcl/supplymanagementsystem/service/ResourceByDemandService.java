package com.hcl.supplymanagementsystem.service;

import java.util.List;

import com.hcl.supplymanagementsystem.dto.ResourcesByDemandDto;

public interface ResourceByDemandService {
	
	List<ResourcesByDemandDto> getResourcesByDemand(Long demandId);

}
