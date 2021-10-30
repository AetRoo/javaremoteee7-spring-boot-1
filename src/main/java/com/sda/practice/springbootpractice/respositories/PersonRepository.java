package com.sda.practice.springbootpractice.respositories;

import com.sda.practice.springbootpractice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to habdle DB operations for Person
 *
 * @author Vinod John
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
