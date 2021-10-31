package com.sda.practice.springbootpractice.models;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Teacher model
 *
 * @author Vinod John
 */
@Data
@Entity
public class Teacher {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstName;
  private String lastName;
  private int age;

  @OneToOne(cascade = CascadeType.MERGE)
  private City city;

  @Enumerated(EnumType.STRING)
  private School school;

  @Enumerated(EnumType.STRING)
  private Speciliazation speciliazation;
}