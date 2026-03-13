package com.example.simpleapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class hellocontroller {
    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
