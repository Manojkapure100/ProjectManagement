package com.springDataJpa.springBoot.entityOrModelOrDomain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Investor_project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int project_investor_id;
  private int projectId;
  private int investorId;
  private int invested_share;
}
