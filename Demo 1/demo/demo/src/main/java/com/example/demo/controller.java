package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Application";
    }

    @GetMapping("/student")
    public student getStudent() {
        return new student(1, "Irfan", "AI & DS");
    }

    @GetMapping("/user")
    public user getUser() {
        return new user(101, "Admin");
    }

}