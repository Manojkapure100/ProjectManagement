package com.springDataJpa.springBoot.repositoryOrInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springDataJpa.springBoot.entityOrModelOrDomain.PropertyLocation;

public interface propertyLocationRepo extends JpaRepository<PropertyLocation,Integer> {

}
