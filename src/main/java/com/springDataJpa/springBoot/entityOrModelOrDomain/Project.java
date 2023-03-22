package com.springDataJpa.springBoot.entityOrModelOrDomain;

import java.time.LocalDateTime;
import java.util.Date;

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
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ProjectId;
  private int progressStatus;
  private String projectName;
  private Date projectStartingDate;
  private Date projectDeadLine;
  private String projectTypeName;
  private int locationId;
  private int userId;
}
