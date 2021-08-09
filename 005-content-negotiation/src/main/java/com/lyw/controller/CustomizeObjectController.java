package com.lyw.controller;

import com.lyw.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CustomizeObjectController {

  @RequestMapping("/")
  public String doIndex() {
    return "index";
  }

  @GetMapping(value = "/stu")
  @ResponseBody
  public Object doStu(HttpServletResponse response, Student student) {
    response.setContentType("application/x-yawei");
    return student;
  }
}
