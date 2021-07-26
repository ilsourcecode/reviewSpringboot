package com.lyw.controller;

import com.lyw.entity.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomizeConverterController {

  @GetMapping("/obj")
  public String doObj(Pet pet) {
    return pet.toString();
  }
}
