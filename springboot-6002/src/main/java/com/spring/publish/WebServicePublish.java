package com.spring.publish;



import com.spring.service.impl.WebServiceImpl;
import javax.xml.ws.Endpoint;


/**
 * 发布Web Service
 */
public class WebServicePublish {

    public static void main(String[] args) {
        //定义WebService的发布地址，这个地址就是提供给外界访问Webervice的URL地址，URL地址格式为：http://ip:端口号/xxxx
        //String address = "http://192.168.1.100:8989/";WebService发布地址
        String address = "http://localhost:8989/Webservice";//WebService发布地址 xml文件查看地址：http://localhost:8989/Webservice?wsdl
        //String address = "http://192.168.1.100:8989/WS_Server/Webservice";
        //使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
        Endpoint.publish(address , new WebServiceImpl());
        System.out.println("发布webservice成功!");
    }
}