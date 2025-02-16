package com.jshah.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add/{n1}/{n2}")
    public int add(@PathVariable int n1, @PathVariable int n2){
        return (n1 + n2);
    }

    @GetMapping("/subtract/{n1}/{n2}")
    public int subtract(@PathVariable int n1, @PathVariable int n2){
        return (n1 - n2);
    }

    @GetMapping("/multiply/{n1}/{n2}")
    public int multiply(@PathVariable int n1, @PathVariable int n2){
        return (n1 * n2);
    }

    @GetMapping("/divide/{n1}/{n2}")
    public int divide(@PathVariable int n1, @PathVariable int n2){
        return (n1 / n2);
    }

    @GetMapping("/remainder/{n1}/{n2}")
    public int remainder(@PathVariable int n1, @PathVariable int n2){
        return (n1 % n2);
    }

}
