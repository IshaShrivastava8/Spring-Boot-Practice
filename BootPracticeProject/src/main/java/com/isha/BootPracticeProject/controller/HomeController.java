package com.isha.BootPracticeProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Isha...";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello Sumaiya...";
    }
}
