package com.lyw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class UrlConfig {

  /***
   *  自定义请求参数的 name 名 setMethodParam("_m")
   *  在表单中带一个隐藏项，name 值为 '_m'
   * @return
   */
  @Bean
  public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
    HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
    hiddenHttpMethodFilter.setMethodParam("_m");
    return hiddenHttpMethodFilter;
  }
}
