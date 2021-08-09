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
@Profile("test")
public class User {

  @Value("10010")
  private Integer id;
  @Value("testUsername")
  private String username;
  @Value("testPassword")
  private String password;
}
