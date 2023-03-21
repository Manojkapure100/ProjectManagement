package com.springDataJpa.springBoot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springDataJpa.springBoot.entityOrModelOrDomain.Investor_project;
import com.springDataJpa.springBoot.entityOrModelOrDomain.Product;
import com.springDataJpa.springBoot.repositoryOrInterface.investorProjectRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.investorRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.productRepository;
import com.springDataJpa.springBoot.repositoryOrInterface.projectRepo;



@RestController
public class cntr1 {

  @Autowired
  // private productRepository productRepository;
  private investorProjectRepo investorProjectRepo;
  private investorRepo investorRepo;
  private projectRepo projectRepo;

  @GetMapping(value="/")
  public String root() {
      return "root page";
  }

  // @GetMapping("/insert")
  // public String insert(){
  //   Product obj = new Product();
  //   obj.setName("abc");
  //   obj.setImageUrl("abc");
  //   obj.setActive(true);
  //   obj.setDescription("abbf");
  //   obj.setPrice(null);
  //   obj.setSku("abcd");

  //   Product myproduct = productRepository.save(obj);
  //   return display(myproduct);
  // }

  // @GetMapping("/display")
  // public String display(Product product) {
  //     return product.toString();
  // }

  @GetMapping("/findProjectsByInvestorId")
  public String findProjectsByInvestorId(@RequestParam int id) {
    List<Integer> obj = investorProjectRepo.findProjectIdByInvestorId(id);
    return obj.toString();
  }

}
