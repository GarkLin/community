package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    //根目录，任何东西都不输入的时候，访问index目录的模板。
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
