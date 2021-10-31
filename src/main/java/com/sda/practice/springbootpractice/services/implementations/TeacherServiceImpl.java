package com.sda.practice.springbootpractice.services.implementations;

import com.sda.practice.springbootpractice.models.City;
import com.sda.practice.springbootpractice.models.Teacher;
import com.sda.practice.springbootpractice.respositories.TeacherRepository;
import com.sda.practice.springbootpractice.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
  @Autowired
  private TeacherRepository teacherRepository;

  @Override
  public List<Teacher> findAllTeachers() {
    return teacherRepository.findAll();
  }

  @Override
  public List<Teacher> findAllTeachersByCity(City city) {
    return teacherRepository.findAllByCity(city);
  }

  @Override
  public void createTeacher(Teacher teacher) {
    teacherRepository.save(teacher);
  }
}
