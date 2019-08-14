package com.nh.thymeleaf.controller;

import com.nh.thymeleaf.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname BookController
 * @Description TODO
 * @Date 2019/8/14 3:43 PM
 * @Created by nihui
 */
@Controller
public class BookController {
    @GetMapping("/book")
    public ModelAndView books(){
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("小明");
        b1.setName("等一个人的咖啡");

        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("小红");
        b2.setName("鬼谷子");

        books.add(b1);
        books.add(b2);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("books",books);
        modelAndView.setViewName("books");
        return modelAndView;
    }
}
