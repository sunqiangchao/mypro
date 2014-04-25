package com.sun.cxf.test1;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	String sayHi(@WebParam(name="text")String text);
}
