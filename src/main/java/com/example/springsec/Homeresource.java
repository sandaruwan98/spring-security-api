package com.example.springsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeresource {

    @GetMapping("/")
    public String home(){
        return ("Hello");
    }
    @GetMapping("/user")
    public String user(){
        return ("Hello, User");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("Hello, Admin");
    }
}
