package com.springDataJpa.springBoot.service;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Investor_project;
import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;

import java.util.List;

public interface ProjectService {

    List<Integer> findAllProjects();

   public Project saveProject(Project project);
}
