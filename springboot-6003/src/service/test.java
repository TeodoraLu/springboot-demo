package service;


import ll.WebServiceImpl;
import ll.WebServiceImplService;
public class test {
        public static void main(String[] args) {
           String a="China";
            WebServiceImplService service =new WebServiceImplService();
            WebServiceImpl portType=service.getWebServiceImplPort();
            String word=portType.sayHello(a);
            System.out.println(word);
        }
    }
