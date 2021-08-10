package com.lyw.applicationRunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author liyawei
 * @Date 2021/8/9-下午5:48
 */
public class CustomizeApplicationRunner implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("application runner is run !");
  }
}
