package com.lyw.controller;

import com.lyw.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomizeObjectController {

  @GetMapping("/stu")
  public Object doStudent(Student stu) {
    return stu;
  }
}
