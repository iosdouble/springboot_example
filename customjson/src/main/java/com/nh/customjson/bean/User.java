package com.nh.customjson.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/8/14 8:20 PM
 * @Created by nihui
 */
@Data
public class User {
    public String name;
    protected String password;
    private String email;
    private Date create_time;
}
