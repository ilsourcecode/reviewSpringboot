package com.lyw.service.impl;

import com.lyw.properties.HelloProperties;
import com.lyw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyawei
 * @Date 2021/8/9-下午3:29
 */

public class HelloServiceImpl implements HelloService {

  @Autowired
  private HelloProperties helloProperties;

  @Override
  public String say() {
    return helloProperties.getPrefix() + " - " + helloProperties.getSuffix();
  }
}
