package com.spring.service;

import com.spring.entity.Io;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface IoService {

    @WebMethod
    String sayHello(String name);


    @WebMethod
    int insertOne(Io recode);

    @WebMethod
    List<Io> getAll();


}
