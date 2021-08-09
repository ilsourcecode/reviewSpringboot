package com.lyw.controller;

import com.lyw.exception.CustomizeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

  @GetMapping("/error")
  @ResponseBody
  public String doError() {
    return "error is run !";
  }

  @GetMapping("/math")
  public void math() {
    int i = 10 / 0;
  }

  @GetMapping("/cust")
  public void cust() {
    throw new CustomizeException();
  }

  @GetMapping("/de")
  public String defaultException(@RequestParam("username") String username) {
    return username;
  }
}
