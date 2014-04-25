package com.sun.cxf.test1;


public class HelloWorldClient {
	 public static void main(String[] args) {
         JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
         svr.setServiceClass(HelloWorld.class);
         svr.setAddress("http://localhost:8080/helloWorld");
         HelloWorld hw = (HelloWorld) svr.create();
         
         System.out.println(hw.sayHi("java"));
         
}
}
