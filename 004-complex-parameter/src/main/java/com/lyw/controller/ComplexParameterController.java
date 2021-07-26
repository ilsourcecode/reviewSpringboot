package com.lyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ComplexParameterController {

  @GetMapping("/hello")
  public String doHello(
          Model model,
          Map<String, Object> map
  ) {

    model.addAttribute("model", "model 携带的数据！");
    map.put("map", "map 携带的数据！");

    return "hello";
  }
}
