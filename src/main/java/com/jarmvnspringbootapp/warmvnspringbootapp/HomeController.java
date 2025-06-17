package com.jarmvnspringbootapp.warmvnspringbootapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("/") // Maps HTTP GET requests to the root path /
    public String rootPage() {
        return "This is the root of the application!";
    }
    @GetMapping("/home")
    public String Home() {
        return "Welcome Maven Spring Boot Web Application";
    }
}