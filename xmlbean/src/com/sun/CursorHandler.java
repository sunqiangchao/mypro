package com.sun;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;


public class CursorHandler {
	 public static void main(String args[]) {
		    try {
		      String filePath = "automobile-policy.xml";
		      java.io.File inputXMLFile = new java.io.File(filePath);
		      XmlObject autoPolicyDoc = 
		    		  XmlObject.Factory.parse(inputXMLFile);
//		      XmlCursor cursor = autoPolicyDoc.newCursor();
//		      cursor.toFirstContentToken();
//		      cursor.toChild(2);
//		      cursor.toChild(2);
//		      System.out.println(cursor.getTextValue());
//		      System.out.println("Type of Token is: " +
//		         cursor.currentTokenType() +
//		      "\nText of Token is" + cursor.xmlText());
		      XmlCursor cursor = autoPolicyDoc.newCursor();
		      String modelQuery = "$this/automobile-policy/insured-vehicle/make";
		      	
		      //Note that execQuery creates a new cursor
		      XmlCursor resultCursor = cursor.execQuery(modelQuery);
		      System.out.println(resultCursor.getTextValue());
		      cursor.dispose();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		    }
}
