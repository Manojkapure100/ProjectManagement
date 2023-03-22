package com.springDataJpa.springBoot.controllers;
import java.util.List;

import com.springDataJpa.springBoot.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springDataJpa.springBoot.repositoryOrInterface.InvestorProjectRepo;

@RestController
public class InvestorProjectController {

  @Autowired
  private InvestorProjectRepo investorProjectRepo;

  @Autowired
  private ProjectService projectService;

  @GetMapping(value = "/")
  public String root() {
    return "root page";
  }

  @GetMapping("/findProjectsByInvestorId")
  public String findProjectsByInvestorId(@RequestParam int id) {
    try {
      List<Integer> obj = investorProjectRepo.findProjectIdByInvestorId(id);
      return obj.toString();
    } catch (Exception e) {
      return e.getMessage();
    }


//  @GetMapping("/invested/project/id")
//  public String findInvestedMoneyByProjectId(@RequestParam int id){
//    List<Investor_project> obj1 = investorProjectRepo.findInvestedMoneyByProjectId(id);
//    return obj1.toString();
  }

  @GetMapping("/findProjectByInvestorId")
  public List<Integer> getAllProjects(){
    return projectService.findAllProjects();
  }
}


