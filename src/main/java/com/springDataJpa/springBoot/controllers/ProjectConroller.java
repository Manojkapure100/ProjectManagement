package com.springDataJpa.springBoot.controllers;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;
import com.springDataJpa.springBoot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectConroller {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public Project saveProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }

}
