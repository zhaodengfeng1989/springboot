package com.sitech.echn.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping("sayHello")
    public String sayHello() {
        return "Hello World!";
    }
}
