package com.lyw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @GetMapping("/redis")
  @ResponseBody
  public String redis(@RequestParam("username") String username,
                      @RequestParam("password") String password
  ) {
    ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
    operations.set("username", username);
    operations.set("password", password);
    String rUsername = operations.get("username");
    String rPassword = operations.get("password");
    return "username -> " + rUsername + " | " + "password -> " + rPassword;
  }

}
