package com.study.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxin on 2018/4/23.
 */
@Controller
public class TestSpringBootApplication {
    @ResponseBody
    @RequestMapping(value = "/index")
    String index(){
        return "Hello Spring Boot1!";
    }
}
