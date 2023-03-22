package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Integer> {
   @Query(value = "select location_id from project where project_id = :id ", nativeQuery = true)
    List<Integer> findLocationByProjectId(@Param("id") int id);
}
