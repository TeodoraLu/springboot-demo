package com.spring.service.impl;

import com.spring.entity.Io;
import com.spring.mapper.IoDao;
import com.spring.service.IoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.List;

@WebService
public class IoServiceImpl implements IoService {
    //@Resource
    // private IoDao ioDao;



    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public  int insertOne(Io recode) {
        //ioDao.insert(null);

               return  0;
    }

   @Override
    public List<Io> getAll(){
       System.out.println("*****");
       // return ioDao.getAll();
      return null;
   }






}
