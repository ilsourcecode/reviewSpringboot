package com.lyw;

import com.lyw.entity.Student;
import com.lyw.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MultiEnvironmentSwitchingApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(MultiEnvironmentSwitchingApplication.class, args);
//    Student bean = run.getBean(Student.class);
//    System.out.println("student -> " + bean);
//    User user = run.getBean(User.class);
//    System.out.println("user -> " + user);

    for (int i = 0; i < run.getBeanDefinitionNames().length; i++) {
      System.out.println(run.getBeanDefinitionNames()[i]);
    }
  }
}
