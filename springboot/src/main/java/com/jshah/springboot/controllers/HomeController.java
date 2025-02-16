package com.jshah.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Use add, subtract, multiply, divide, remainder with n1 and n2";
    }

}
