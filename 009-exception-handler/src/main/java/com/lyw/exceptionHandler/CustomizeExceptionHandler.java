package com.lyw.exceptionHandler;

import com.lyw.exception.CustomizeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CustomizeExceptionHandler {

  @ExceptionHandler({CustomizeException.class})
  @ResponseBody
  public String doException(Exception e) {
    System.out.println(e.getMessage());
    return "自定义的异常！";
  }
}
