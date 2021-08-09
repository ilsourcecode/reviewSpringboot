package com.lyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

  @GetMapping("/redirect")
  public String doRedirect() {
    return "redirect:/index.html";
  }
}
