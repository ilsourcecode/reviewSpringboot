package com.lyw.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "自定义的异常啊！是吧-----")
public class CustomizeException extends RuntimeException{

  public CustomizeException() {
  }

  public CustomizeException(String message) {
    super(message);
  }
}
