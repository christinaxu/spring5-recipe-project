package com.example.spring5receiptproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
