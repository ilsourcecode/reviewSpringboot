package com.lyw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReqParamController {

  @GetMapping("/sub")
  public String doGet() {
    return "get";
  }

  @PostMapping("/sub")
  public String doPost() {
    return "post";
  }

  @DeleteMapping("/sub")
  public String doDelete() {
    return "delete";
  }

  @PutMapping("/sub")
  public String doPut() {
    return "put";
  }
}
