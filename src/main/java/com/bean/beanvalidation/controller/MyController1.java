package com.bean.beanvalidation.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/controller-1")
public class MyController1 {

    @GetMapping("/home")
    public String home(){
        return "My Controller-1 Home page Hit...";
    }


    @PostMapping("/add")
    public Student addStudent(@Valid @RequestBody Student student){
        return student;
    }
}
