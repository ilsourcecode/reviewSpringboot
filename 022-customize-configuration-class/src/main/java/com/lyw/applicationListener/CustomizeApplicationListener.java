package com.lyw.applicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author liyawei
 * @Date 2021/8/9-下午5:45
 */
public class CustomizeApplicationListener implements ApplicationListener {

  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {
    System.out.println("application listener is run ! ---------------");
  }
}
