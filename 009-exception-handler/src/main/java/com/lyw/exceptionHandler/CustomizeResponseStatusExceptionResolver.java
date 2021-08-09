package com.lyw.exceptionHandler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomizeResponseStatusExceptionResolver extends ResponseStatusExceptionResolver {
}
