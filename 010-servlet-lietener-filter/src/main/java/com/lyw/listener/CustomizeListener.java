package com.lyw.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomizeListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("application container is created!");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("application container is destroy!");
  }
}
