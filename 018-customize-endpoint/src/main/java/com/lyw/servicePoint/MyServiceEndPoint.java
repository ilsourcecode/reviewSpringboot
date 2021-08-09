package com.lyw.servicePoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Endpoint(id = "myservice")
public class MyServiceEndPoint {

  @ReadOperation
  public Map getOtherInfo(){
    //端点的读操作  http://localhost:8080/actuator/myservice
    return Collections.singletonMap("other","other started.....");
  }

  @WriteOperation
  public void stopDocker(){
    System.out.println("docker stopped.....");
  }
}
