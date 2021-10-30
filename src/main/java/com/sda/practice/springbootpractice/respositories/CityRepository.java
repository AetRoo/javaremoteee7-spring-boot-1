package com.sda.practice.springbootpractice.respositories;

import com.sda.practice.springbootpractice.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to handle DB related City operations
 *
 * @author Vinod John
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
