package com.lyw.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Profile("prod")
public class Student {

  @Value("10086")
  private Integer id;
  @Value("zhangsan")
  private String username;
  @Value("false")
  private boolean sex;
  @Value("anhuihefei")
  private String addr;
}
