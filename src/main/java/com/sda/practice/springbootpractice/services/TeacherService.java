package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;

import java.util.List;
import java.util.Optional;

/**
 * Service to handle teacher related operations
 *
 * @author Vinod John
 */
public interface TeacherService {

  /**
   * To find all teachers
   *
   * @return List of Teacher
   */
  List<Teacher> findAllTeachers();

  /**
   * To find all teachers by city
   *
   * @param city City
   * @return List of Teacher
   */
  List<Teacher> findAllTeachersByCity(City city);

  /**
   * To create a new teacher
   *
   * @param teacher Teacher
   */
  void createTeacher(Teacher teacher);

  /**
   * To find teacher by Id
   * @param id Id of the teacher
   * @return Optional of Teacher
   */
  Optional<Teacher> findTeacherById(Long id);

  /**
   * To update a teacher
   * @param teacher Teacher
   */
  void updateTeacher(Teacher teacher);
}
