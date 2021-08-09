package com.lyw.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liyawei
 * @Date 2021/8/9-下午4:25
 */

@ConfigurationProperties("spring.hello")
public class HelloProperties {

  private String prefix;
  private String suffix;

  public HelloProperties() {}

  public HelloProperties(String prefix, String suffix) {
    this.prefix = prefix;
    this.suffix = suffix;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  @Override
  public String toString() {
    return "HelloProperties{" +
            "prefix='" + prefix + '\'' +
            ", suffix='" + suffix + '\'' +
            '}';
  }
}
