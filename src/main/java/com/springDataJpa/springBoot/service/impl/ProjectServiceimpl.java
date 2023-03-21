package com.springDataJpa.springBoot.service.impl;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;
import com.springDataJpa.springBoot.repositoryOrInterface.ProjectRepo;
import com.springDataJpa.springBoot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceimpl implements ProjectService {

   @Autowired
   private ProjectRepo projectRepo;

    @Override
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }
}
