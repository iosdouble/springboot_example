package com.nh.thymeleaf.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname Book
 * @Description TODO
 * @Date 2019/8/14 3:42 PM
 * @Created by nihui
 */
//@Getter
//@Setter

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
}
