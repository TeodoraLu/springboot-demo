package com.spring.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *  定义服务器端service接口
 */
//使用@WebService注解标注WebServiceI接口
@WebService
public interface WebServiceI {
    //使用@WebMethod注解标注WebServiceI接口中的方法
    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name, String pwd);
}
