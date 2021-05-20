package service;



import demo.WebServiceImpl;
import demo.WebServiceImplService;

import ioservice.Io;
import ioservice.IoServiceImpl;
import ioservice.IoServiceImplService;


import java.util.List;


public class test {


        public static void main(String[] args) {
           String a="China";
            String b ="io接口";
            WebServiceImplService service =new WebServiceImplService();
           WebServiceImpl portType=service.getWebServiceImplPort();
            String word=portType.sayHello(a);
            System.out.println(word);

            IoServiceImplService service1=new IoServiceImplService();
            IoServiceImpl portType1=service1.getIoServiceImplPort();
            //List<Io> list1=portType1.getAll();
            portType1.getAll();



        }
    }
