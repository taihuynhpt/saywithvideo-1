package com.saywithvideo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/hello")
    public String hello(){
        return "abc";
    }
}
