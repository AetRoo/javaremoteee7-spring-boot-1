package com.sda.practice.springbootpractice.services.implementations;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.respositories.CityRepository;
import com.sda.practice.springbootpractice.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CityServiceImpl implements CityService {
  @Autowired
  private CityRepository cityRepository;

  @Override
  public List<City> findAllCities() {
    return cityRepository.findAll();
  }
}
