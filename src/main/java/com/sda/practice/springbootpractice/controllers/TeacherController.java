package com.sda.practice.springbootpractice.controllers;

import com.sda.practice.springbootpractice.models.Teacher;
import com.sda.practice.springbootpractice.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Controller to handle Teacher related web requests
 *
 * @author Vinod John
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
  @Autowired
  private TeacherService teacherService;

  @GetMapping
  public List<Teacher> getAllTeachers() {
    return teacherService.findAllTeachers();
  }

  @PostMapping
  public ResponseEntity<?> addTeacher(@RequestBody Teacher teacher) {
    teacherService.createTeacher(teacher);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher) {
    teacherService.updateTeacher(teacher);

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.setDate(new Date().toInstant());
    return new ResponseEntity<>(teacher, headers, HttpStatus.OK);
  }

  @GetMapping("/delete/{id}")
  public ResponseEntity<?> deleteTeacher(@PathVariable("id") Long id) {
    teacherService.deleteTeacherById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/restore/{id}")
  public ResponseEntity<?> restoreTeacher(@PathVariable("id") Long id) {
    teacherService.restoreTeacherById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
