package com.lyw.applicationRunner;

import org.springframework.boot.CommandLineRunner;

/**
 * @author liyawei
 * @Date 2021/8/9-下午5:49
 */
public class CustomizeCommandLineRunner implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    System.out.println("Command line is run !");
  }
}
