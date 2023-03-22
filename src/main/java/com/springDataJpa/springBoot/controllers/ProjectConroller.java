package com.springDataJpa.springBoot.controllers;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;
import com.springDataJpa.springBoot.repositoryOrInterface.ProjectRepo;
import com.springDataJpa.springBoot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectConroller {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectRepo projectRepo;


    @PostMapping("/project")
    public Project saveProject(@RequestBody Project project){
        try {
            return projectService.saveProject(project);
        }
        catch (Exception e){
            return null;
        }
    }

    @GetMapping("/findLocationByProjectId")
    public String findLocationByProjectId(@RequestParam int id){
        try {
            List<Integer> obj = projectRepo.findLocationByProjectId(id);
            return obj.toString();
        }
        catch (Exception e){
            return e.getMessage();
        }
    }


}
