package com.ibm.fullstack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fullstack.entity.Skill;
import com.ibm.fullstack.service.SkillService;

@RestController
@CrossOrigin
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @DeleteMapping(value = "/")
    public boolean delete(@RequestParam("skillId") Long skillId) {
        skillService.delete(skillId);
        return true;
    }
    
    @GetMapping(value = "/find")
    public Optional<Skill> findById(@RequestParam("skillId") Long skillId) {
        return skillService.findById(skillId);
    }
    
    @PostMapping(value = "/")
    public Skill save(@RequestBody Skill skill) {
        return skillService.save(skill);
    }
    
    @GetMapping(value = "/findAll")
    public List<Skill> findAll() {
        return skillService.findAll();
    }
}