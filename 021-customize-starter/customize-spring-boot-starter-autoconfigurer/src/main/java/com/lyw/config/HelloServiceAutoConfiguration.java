package com.lyw.config;

import com.lyw.properties.HelloProperties;
import com.lyw.service.HelloService;
import com.lyw.service.impl.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyawei
 * @Date 2021/8/9-下午4:28
 */

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean(HelloService.class)
  public HelloService helloService() {
    return new HelloServiceImpl();
  }
}


