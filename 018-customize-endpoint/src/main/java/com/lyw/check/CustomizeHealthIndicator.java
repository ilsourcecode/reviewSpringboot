package com.lyw.check;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CustomizeHealthIndicator extends AbstractHealthIndicator {
  @Override
  protected void doHealthCheck(Health.Builder builder) throws Exception {
    // 正常运行，信息不详细
    builder.up();
    HashMap<String, Object> map = new HashMap<>();
    map.put("hello", "world");
    map.put("你好", "世界");
    // 显示的详细信息
    builder.withDetail("code", 500).withDetails(map);
  }
}
