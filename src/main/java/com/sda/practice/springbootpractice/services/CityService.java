package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;

import java.util.List;

/**
 * Service to handle City related operations
 *
 * @author Vinod John
 */
public interface CityService {

  /**
   * To find all the cities
   *
   * @return List of City
   */
  List<City> findAllCities();
}
