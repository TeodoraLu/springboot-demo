package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HappyController {

    @GetMapping("/topage")
    public String toPage(){
        return  "biaoqingbao";
    }


}
