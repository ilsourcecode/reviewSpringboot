package com.lyw.controller;

import com.lyw.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Autowired
  DataSource dataSource;

  @GetMapping("/sql")
  @ResponseBody
  public String doOther() {
    return dataSource.getClass().toString();
  }

  @GetMapping("/all")
  @ResponseBody
  public String all() {
    List<Map<String, Object>> users = jdbcTemplate.queryForList("select id, username, password from users order by id asc ");
    return users.toString();
  }
}
