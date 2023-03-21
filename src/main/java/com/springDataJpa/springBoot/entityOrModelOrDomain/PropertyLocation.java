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
public class PropertyLocation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int locationId;
  private String state;
  private String city;
  private String area;
}
