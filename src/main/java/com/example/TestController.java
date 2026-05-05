package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Connection is successful!";
    }
    @GetMapping("/")
    public String test1(){
        return "Connection is successful!";
    }

    @GetMapping("/health")
    public String health(){
        return "Application looks healthy!";
    }
}
