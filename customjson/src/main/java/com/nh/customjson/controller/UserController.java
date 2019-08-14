package com.nh.customjson.controller;

import com.nh.customjson.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/8/14 8:22 PM
 * @Created by nihui
 */
@RestController
public class UserController {
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setName("nihui");
        user.setPassword("123222");
        user.setEmail("nihui@163.com");
        user.setCreate_time(new Date());
        return user;

    }
}
