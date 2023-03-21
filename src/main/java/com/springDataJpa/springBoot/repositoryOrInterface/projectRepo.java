package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;

public interface projectRepo extends JpaRepository<Project,Integer> {

}
