package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookMapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SpringController { // new SpringController();

    //@Autowired
    private final  BookMapper mapper;
    public  SpringController(BookMapper mapper){
        this.mapper=mapper;
    }

    @RequestMapping("/spring")
    public String index(){
        return "template"; // template.jsp
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Book> list=mapper.bookList();
        model.addAttribute("list", list);
        return "list"; // list.jsp
    }

    @RequestMapping("/bible")
    public String bible(){
        return "bible";
    }
}
