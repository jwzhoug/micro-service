package com.jwzhoug.microservicetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试 控制器
 *
 * @author: zhoujw
 * @Date: 2019-05-15
 */
@RestController
public class RestDemoController {

    @GetMapping("/")
    public String index() {
        return "Hello,World";
    }

    @GetMapping("/404.html")
    public Object errorPageHandler(HttpServletRequest request, HttpServletResponse response, Throwable throwable) {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String,String> result = new HashMap<>();
        result.put("message", String.valueOf(request.getAttribute("javax.servlet.error.message")));
        result.put("statusCode", String.valueOf(request.getAttribute("javax.servlet.error.status_code")));
        return result;
    }

    @GetMapping("/npe")
    public String npe(){
        throw new NullPointerException("故意抛出的异常!");
    }
}
