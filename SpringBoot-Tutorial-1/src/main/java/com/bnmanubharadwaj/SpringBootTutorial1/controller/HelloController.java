package com.bnmanubharadwaj.SpringBootTutorial1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {

        return "welcome Manu Bharadwaj BN";
    }
}
