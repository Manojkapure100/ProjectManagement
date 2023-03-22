package com.springDataJpa.springBoot.repositoryOrInterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Investor_project;

public interface InvestorProjectRepo extends JpaRepository<Investor_project,Integer> {

  @Query(value = "select * from investor_project where investor_id = :id",nativeQuery=true)
  List<Investor_project> findByInvestorId(@Param("id") int id);

  @Query(value = "select distinct project_id from investor_project where investor_id = :id", nativeQuery = true)
  List<Integer> findProjectIdByInvestorId(@Param("id") int id);

// @Query(value = "select project.project_id, investor_project.invested_share from investor_project inner join project on project.project_id=investor_project.project_id",nativeQuery = true)
//  List<Investor_project> findInvestedMoneyByProjectId(@Param("id") int id);
 @Query(value = "select distinct project_id from investor_project where investor_id = 1 ",nativeQuery = true)
 List<Integer> findAllProjects();
}
