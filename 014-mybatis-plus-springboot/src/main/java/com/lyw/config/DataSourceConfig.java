package com.lyw.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {
    return new DruidDataSource();
  }

  /***
   *  mybatis-plus 分页的拦截器
   * @return mybatis-plus 的拦截器对象
   */
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor() {
    MybatisPlusInterceptor mpi = new MybatisPlusInterceptor();
    // 内部分页插件
    PaginationInnerInterceptor pii = new PaginationInnerInterceptor();
    // 设置请求页面大于最大页面， true 跳到首页， false继续请求，默认 false
    pii.setOverflow(true);
    // 设置页面最大限制，默认 500L，-1 不受限制
    pii.setMaxLimit(500L);
    mpi.addInnerInterceptor(pii);
    return mpi;
  }
}
