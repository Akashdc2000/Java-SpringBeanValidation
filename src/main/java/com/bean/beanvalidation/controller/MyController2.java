package com.bean.beanvalidation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller-2")
public class MyController2 {

    @GetMapping("/home")
    public String home(){
        return "My Controller2 Home Url Hit ";
    }
}
