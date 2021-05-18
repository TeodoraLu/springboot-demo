package com.spring.service.impl;


import com.spring.service.WebServiceI;

import javax.jws.WebService;

/**
 * 使用@WebService注解标注WebServiceI接口的实现类WebServiceImpl
 */
@WebService
public class WebServiceImpl implements WebServiceI {

    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public String save(String name, String pwd) {
        System.out.println("WebService save "+name+"， "+pwd);
        return "save Success";
    }
}
