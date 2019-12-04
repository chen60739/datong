package com.example.datong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackController {

    @GetMapping("/back")
    public String back(){
        return "back";
    }
}
