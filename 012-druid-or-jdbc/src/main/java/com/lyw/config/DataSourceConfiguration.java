package com.lyw.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Configuration
public class DataSourceConfiguration {

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() throws SQLException {
    DruidDataSource source = new DruidDataSource();
    // 开启监控
//    source.setFilters("stat,wall");
    return source;
  }

  /*@Bean
  public FilterRegistrationBean<WebStatFilter> filterFilterRegistrationBean() {
    WebStatFilter webStatFilter = new WebStatFilter();
    FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(webStatFilter);
    bean.setUrlPatterns(Arrays.asList("/*"));
    bean.addInitParameter("exclusions",
            "*.jpg,*.js,*.css,*.png,*.gif,*.ico,/druid/*");
    return bean;
  }

  @Bean
  public ServletRegistrationBean<StatViewServlet> servletServletRegistrationBean() {
    StatViewServlet statViewServlet = new StatViewServlet();
    ServletRegistrationBean<StatViewServlet> bean =
            new ServletRegistrationBean<>(statViewServlet, "/druid/*");
    bean.addInitParameter("loginUsername", "admin");
    bean.addInitParameter("loginPassword", "123");
    return bean;
  }*/

}
