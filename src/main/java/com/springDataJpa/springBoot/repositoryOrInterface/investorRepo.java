package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Investor;

public interface investorRepo extends JpaRepository<Investor,Integer> {

}
