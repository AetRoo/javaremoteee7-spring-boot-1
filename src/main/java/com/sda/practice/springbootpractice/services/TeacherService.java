package com.sda.practice.springbootpractice.services;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;

import java.util.List;

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
}
