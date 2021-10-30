package com.sda.practice.springbootpractice.services.implementations;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Person;
import com.sda.practice.springbootpractice.respositories.PersonRepository;
import com.sda.practice.springbootpractice.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
  @Autowired
  private PersonRepository personRepository;

  @Override
  public List<Person> findAllPersons() {
    return personRepository.findAll();
  }

  @Override
  public List<Person> findAllPersonsByCity(City city) {
    return personRepository.findAllByCity(city);
  }
}
