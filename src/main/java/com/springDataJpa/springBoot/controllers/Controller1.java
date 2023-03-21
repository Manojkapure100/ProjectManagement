package com.springDataJpa.springBoot.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springDataJpa.springBoot.repositoryOrInterface.investorProjectRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.investorRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.projectRepo;

@RestController
public class Controller1 {

  @Autowired
  private investorProjectRepo investorProjectRepo;
  private investorRepo investorRepo;
  private projectRepo projectRepo;

  @GetMapping(value="/")
  public String root() {
      return "root page";
  }

  @GetMapping("/findProjectsByInvestorId")
  public String findProjectsByInvestorId(@RequestParam int id) {
    List<Integer> obj = investorProjectRepo.findProjectIdByInvestorId(id);
    return obj.toString();
  }

}
