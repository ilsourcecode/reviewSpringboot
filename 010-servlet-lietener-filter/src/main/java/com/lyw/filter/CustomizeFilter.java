package com.lyw.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(urlPatterns = {"/js/*", "/servlet"})
public class CustomizeFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    String requestURI = ((HttpServletRequest) request).getRequestURI();
    response.setContentType("text/html;charset=utf-8");
    response.getWriter().println(requestURI + "：资源地址被拦截！");

  }
}
