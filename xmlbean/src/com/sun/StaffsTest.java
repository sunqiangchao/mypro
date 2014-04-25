package com.sun;

import java.util.List;

import noNamespace.StaffsDocument;
import noNamespace.StaffsDocument.Staffs;

public class StaffsTest {
	public static void main(String[] args) {
		 try {
			   String filePath = "monitor-staffs.xml";
			   java.io.File inputXMLFile = new java.io.File(filePath);
			   
			   StaffsDocument staffDoc = StaffsDocument.Factory.parse(inputXMLFile);
			   
			   List<Staffs> staffs = (List<Staffs>) staffDoc.getStaffs();
			   
			  System.out.println(staffs.size());
			   
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
		
		
		
		
	}
}
