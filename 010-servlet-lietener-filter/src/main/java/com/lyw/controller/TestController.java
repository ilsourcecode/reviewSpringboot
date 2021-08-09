package com.lyw.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class TestController {

  @GetMapping({"/", "/index"})
  public String main() {
    return "index";
  }
}
