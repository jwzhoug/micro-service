package com.jwzhoug.microservicetest.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义 拦截器
 *
 * @author: zhoujw
 * @Date: 2019-05-15
 */
public class DefaultInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.printf("Object handler: " + handler.toString());

        return true;
    }
}
