package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.Person;

import java.util.List;

/**
 * Service to handle person related operations
 *
 * @author Vinod John
 */
public interface PersonService {

  /**
   * To find all persons
   * @return List of Person
   */
  List<Person> findAllPersons();
}
