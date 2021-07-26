package com.lyw.bean;

import com.lyw.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

  @Autowired
  private HelloProperties properties;

  public String doSome(String username) {
    return properties.getPrefix() + ":" + username + " -> " + properties.getSuffix();
  }
}
