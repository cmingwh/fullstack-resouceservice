package com.ibm.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fullstack.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

}