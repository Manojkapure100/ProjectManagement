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
public class Investor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int InvestorId;
  private String name;
  private String Email;
  private String Address;
  private String number;
  private int Experience;
}
