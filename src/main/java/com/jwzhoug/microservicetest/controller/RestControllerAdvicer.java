package com.jwzhoug.microservicetest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 控制器异常拦截
 *
 * @author: zhoujw
 * @Date: 2019-05-15
 */
@RestControllerAdvice
public class RestControllerAdvicer {

    @ExceptionHandler(NullPointerException.class)
    public String exceptionHandler(Throwable throwable){
        return throwable.getMessage();
    }
}
