package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 同时映射根路径 "/" 与 "/hello"，避免访问首页时出现 404。
     */
    @GetMapping({"/", "/hello"})
    public String hello() {
        return "Hello Spring Boot，这是一个简单的 RESTful API！";
    }
}
