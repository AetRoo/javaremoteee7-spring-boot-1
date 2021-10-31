package com.sda.practice.springbootpractice.respositories;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository to handle DB operations for Teacher
 *
 * @author Vinod John
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
  List<Teacher> findAllByCity(City city);
}
