package com.nh.backjson.controller;

import com.nh.backjson.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Classname BookController
 * @Description TODO
 * @Date 2019/8/14 7:55 PM
 * @Created by nihui
 */
//@Controller
@RestController
public class BookController {
    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book book = new Book();
        book.setAuther("倪辉");
        book.setName("CSDN博客");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
