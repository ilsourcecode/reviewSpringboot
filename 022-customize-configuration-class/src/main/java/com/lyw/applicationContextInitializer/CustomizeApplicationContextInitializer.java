package com.lyw.applicationContextInitializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liyawei
 * @Date 2021/8/9-下午5:35
 */
public class CustomizeApplicationContextInitializer implements ApplicationContextInitializer {

  @Override
  public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
    System.out.println("init is run!----------------");
  }
}
