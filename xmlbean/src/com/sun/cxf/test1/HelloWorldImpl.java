package com.sun.cxf.test1;

import javax.jws.WebService;



@WebService(endpointInterface="com.sun.cxf.test1.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {
           public String sayHi(String text) {
                       return "Hello " + text;
          }
           
}
