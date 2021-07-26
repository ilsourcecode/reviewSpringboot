package com.lyw.auto;

import com.lyw.bean.HelloService;
import com.lyw.properties.HelloProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean(HelloService.class)
  public HelloService helloService() {
    return new HelloService();
  }
}
