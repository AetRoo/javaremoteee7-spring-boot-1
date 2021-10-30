package com.sda.practice.springbootpractice.controllers;

import com.sda.practice.springbootpractice.models.Person;
import com.sda.practice.springbootpractice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Controller to handle Person related web requests
 *
 * @author Vinod John
 */
@Controller
public class PersonController {
  @Autowired
  private PersonService personService;

  public List<Person> getAllPersons(){
    return personService.findAllPersons();
  }
}
