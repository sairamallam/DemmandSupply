package com.hcl.supplymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.supplymanagementsystem.dto.ResourcesByDemandDto;
import com.hcl.supplymanagementsystem.entity.DemandSkills;

public interface DemandSkillRepository extends JpaRepository<DemandSkills, Long>{
	
	
	@Query("select New com.hcl.supplymanagementsystem.dto.ResourcesByDemandDto(rs.resources.resourcesId,r.name,drs.skill.skillId,sk.skillName)" 
			+" from "
			+" DemandSkills ds,ResourceSkills rs,Resources r,ResourceSkills drs,Skill sk"  
			+" where ds.demand.demandId=:demandId and" 
			+" ds.skill.skillId=rs.skill.skillId" 
			+" and rs.resources.resourcesId=r.resourcesId"
			+" and drs.resourceSkillsId=r.resourcesId" 
			+" and drs.skill.skillId=sk.skillId group by rs.skill.skillId")
	List<ResourcesByDemandDto> getResourcesByDemand(@Param("demandId") Long demandId);

}
