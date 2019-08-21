package com.nh.springbootstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/8/21 1:50 PM
 * @Created by nihui
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World!";
    }
}
