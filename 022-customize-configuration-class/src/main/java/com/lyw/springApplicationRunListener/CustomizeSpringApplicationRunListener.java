package com.lyw.springApplicationRunListener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author liyawei
 * @Date 2021/8/9-下午5:46
 */
public class CustomizeSpringApplicationRunListener implements SpringApplicationRunListener {

  private SpringApplication application;
  private String[] args;

  public CustomizeSpringApplicationRunListener(SpringApplication application, String[] args) {
    this.application = application;
    this.args = args;
  }


  @Override
  public void starting(ConfigurableBootstrapContext bootstrapContext) {
    System.out.println("starting ---- 0");
  }

  @Override
  public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
    System.out.println("environmentPrepared ---- 1");
  }

  @Override
  public void contextPrepared(ConfigurableApplicationContext context) {
    System.out.println("contextPrepared ---- 2");
  }

  @Override
  public void contextLoaded(ConfigurableApplicationContext context) {
    System.out.println("contextLoaded ---- 3");
  }

  @Override
  public void started(ConfigurableApplicationContext context) {
    System.out.println("started ---- 4");
  }

  @Override
  public void running(ConfigurableApplicationContext context) {
    System.out.println("running ---- 5");
  }

  @Override
  public void failed(ConfigurableApplicationContext context, Throwable exception) {
    System.out.println("failed ---- 6");
  }
}
