package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;

public interface projectRepo extends JpaRepository<Project,Integer> {
  @Query(value = "select project_name from project where Project_id = :id",nativeQuery=true)
  String findByProjectId(@Param("id") int id);
}
