package com.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 首页控制器
 */
@Controller
public class IndexController {
    //通过get方式请求路径
    @GetMapping("/")
    public String index(){
        return "showindex";
    }






}