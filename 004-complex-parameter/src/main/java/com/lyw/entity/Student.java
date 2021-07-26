package com.lyw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private Integer id;
  private String stuName;
  private String stuAddr;
  private Integer stuAge;
}
