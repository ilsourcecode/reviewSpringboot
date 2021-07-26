package com.lyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ParameterTransmitController {

  @GetMapping(value = "/pathVariable/{id}",produces = "text/html;charset=utf-8")
  @ResponseBody
  public String pathVariable(
          @PathVariable("id") Integer id,
          @RequestParam("username") String username,
          @RequestHeader("User-Agent") String header
  ) {
    Map<String, Object> map = new HashMap<>();
    map.put("id", id);
    map.put("username",username);
    map.put("header", header);
    return map.toString();
  }

  @PostMapping(value = "/postReq",produces = "text/html;charset=utf-8")
  @ResponseBody
  public String postRequest(
          @RequestBody String content
  ) {
    return content;
  }

  @GetMapping("/redirect")
  public String doRedirect(HttpServletRequest request) {
    request.setAttribute("meg", "携带的数据！");
    return "redirect:/dest";
  }

  @GetMapping(value = "/dest",produces = "text/html;charset=utf-8")
  @ResponseBody
  public String dest(
          HttpServletRequest request
  ) {
    String meg = request.getParameter("meg");
    System.out.println("meg--------" + meg + "----");
    return meg;
  }

  @GetMapping(value = "/matrixVariable/{path}", produces = "text/html;charset=utf-8")
  @ResponseBody
  public String matrixVariable(
          @MatrixVariable("id") List<Integer> id,
          @MatrixVariable("username") String username,
          @MatrixVariable("age") Integer age
  ) {
    Map<String, Object> map = new HashMap<>();
    map.put("id", id);
    map.put("username", username);
    map.put("age", age);
    return map.toString();
  }

  @GetMapping(value = "/user/{boss}/{emp}", produces = "text/html;charset=utf-8")
  @ResponseBody
  public String other(
          @MatrixVariable(value = "age",pathVar = "boss") Integer bossAge,
          @MatrixVariable(value = "age",pathVar = "emp") Integer empAge
  ) {
    return "boss age -> " + bossAge + " | emp age -> " + empAge;
  }
}
