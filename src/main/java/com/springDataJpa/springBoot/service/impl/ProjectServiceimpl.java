package com.springDataJpa.springBoot.service.impl;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;
import com.springDataJpa.springBoot.repositoryOrInterface.InvestorProjectRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.ProjectRepo;
import com.springDataJpa.springBoot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceimpl implements ProjectService {

   @Autowired
   private ProjectRepo projectRepo;

   @Autowired
   private InvestorProjectRepo investorProjectRepo;




    @Override
    public List<Integer> findAllProjects() {

        return investorProjectRepo.findAllProjects();
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }
}
