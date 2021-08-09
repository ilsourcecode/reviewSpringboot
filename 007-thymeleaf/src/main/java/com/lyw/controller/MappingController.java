package com.lyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class MappingController {

  @GetMapping({"/", "/main", "/index.html"})
  public String doMain(HttpSession session, Model model, Map<String, Object> map) {
    model.addAttribute("model", "model 携带的数据！");
    map.put("map", "map 携带的数据！");
    session.setAttribute("session", "session 携带的数据！");
    return "index";
  }

  @GetMapping("/basic-form.html")
  public String doForm() {
    return "basic-form";
  }

  @GetMapping("/form-layouts.html")
  public String doFormLayouts() {
    return "form-layouts";
  }

  @GetMapping("/login.html")
  public String doLogin() {
    return "login";
  }

  @GetMapping("/maps.html")
  public String doMaps() {
    return "maps";
  }

  @GetMapping("/profile.html")
  public String doProfile() {
    return "profile";
  }

  @GetMapping("/tables.html")
  public String doTables() {
    return "tables";
  }

  @GetMapping("/email.html")
  public String doEmail() {
    return "email";
  }
}
