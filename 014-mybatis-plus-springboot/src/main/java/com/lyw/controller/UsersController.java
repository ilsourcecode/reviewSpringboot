package com.lyw.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyw.entity.Users;
import com.lyw.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {

  @Autowired
  private UsersService usersService;

  @GetMapping(value = "/users")
  @ResponseBody
  public List<Users> users() {
    return usersService.list();
  }

  @GetMapping("/page{id}")
  public String page(@RequestParam(value = "pn", defaultValue = "1") Integer id, Model model) {
    Page<Users> page = new Page<>(id, 2);
    Page<Users> pages = usersService.page(page, null);
    model.addAttribute("pages", pages);
    return "tables";
  }
}
