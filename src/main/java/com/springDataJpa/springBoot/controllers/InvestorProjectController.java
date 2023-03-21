package com.springDataJpa.springBoot.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springDataJpa.springBoot.repositoryOrInterface.InvestorProjectRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.InvestorRepo;
import com.springDataJpa.springBoot.repositoryOrInterface.ProjectRepo;

@RestController
public class InvestorProjectController {

  @Autowired
  private InvestorProjectRepo investorProjectRepo;

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
