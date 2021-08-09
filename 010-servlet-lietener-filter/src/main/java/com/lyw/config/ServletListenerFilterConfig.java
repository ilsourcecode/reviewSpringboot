package com.lyw.config;

import com.lyw.filter.CustomizeFilter;
import com.lyw.listener.CustomizeListener;
import com.lyw.servlet.CustomizeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ServletListenerFilterConfig {

  @Bean
  public ServletRegistrationBean<CustomizeServlet> servletServletRegistrationBean() {
    ServletRegistrationBean<CustomizeServlet> bean = new ServletRegistrationBean<>();
    bean.setServlet(new CustomizeServlet());
    bean.setUrlMappings(Arrays.asList("/servlet"));
    return bean;
  }

  @Bean
  public ServletListenerRegistrationBean<CustomizeListener> servletListenerRegistrationBean() {
    ServletListenerRegistrationBean<CustomizeListener> bean = new ServletListenerRegistrationBean<>();
    bean.setListener(new CustomizeListener());

    return bean;
  }

  @Bean
  public FilterRegistrationBean<CustomizeFilter> filterFilterRegistrationBean() {
    FilterRegistrationBean<CustomizeFilter> bean = new FilterRegistrationBean<>();
    bean.setFilter(new CustomizeFilter());
    bean.setServletNames(Arrays.asList("CustomizeServlet"));
    bean.setUrlPatterns(Arrays.asList("/servlet", "/js/*"));
    return bean;
  }
}
