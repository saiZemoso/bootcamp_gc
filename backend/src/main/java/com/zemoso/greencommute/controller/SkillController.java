package com.zemoso.greencommute.controller;

import com.zemoso.greencommute.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin({"http://ec2-44-214-142-66.compute-1.amazonaws.com","http://localhost:8080"})
@RequestMapping("/v1/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping("/{name}")
    public int getSkill(@PathVariable("name") String name){
       return skillService.findSkillByName(name) ;
    }
}
