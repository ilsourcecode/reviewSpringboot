package com.lyw.controller;

import com.lyw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyawei
 * @Date 2021/8/9-下午3:33
 */

@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/hello")
  public String say() {
    return helloService.say();
  }
}
