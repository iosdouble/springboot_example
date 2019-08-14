package com.nh.backjson.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @Classname Book
 * @Description TODO
 * @Date 2019/8/14 7:53 PM
 * @Created by nihui
 */
@Data
public class Book {
    private String name;
    private String auther;
    @JsonIgnore
    private Float price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
}
