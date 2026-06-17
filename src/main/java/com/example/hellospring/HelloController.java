package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }

    @GetMapping("/message")
    public String message() {
        return "This is a simple Spring Boot REST API returning a String.";
    }
}
