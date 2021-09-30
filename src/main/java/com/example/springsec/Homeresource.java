package com.example.springsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeresource {
    @GetMapping("/")
    public String home(){
        return ("Hello");
    }
}
