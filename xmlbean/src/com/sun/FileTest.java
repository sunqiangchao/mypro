package com.sun;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		
		File file = new File("test/text.xml");
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
			
			
		}else{
			System.out.println("cunzai");
		}
		
		if(file.exists()){
			System.out.println("1111111111");
		}else{
			System.out.println("2222222222");
		}
		
	}
}
