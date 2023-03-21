package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Investor;

public interface InvestorRepo extends JpaRepository<Investor,Integer> {

}
