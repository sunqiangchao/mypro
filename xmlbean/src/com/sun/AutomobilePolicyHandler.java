package com.sun;

import noNamespace.AutomobilePolicyDocument;

public class AutomobilePolicyHandler {
	 public static void main(String args[]) {
		  try {
		   String filePath = "automobile-policy.xml";
		   java.io.File inputXMLFile = new java.io.File(filePath);
		   AutomobilePolicyDocument autoPolicyDoc =
		     AutomobilePolicyDocument.Factory.parse(inputXMLFile);
		   AutomobilePolicyDocument.AutomobilePolicy autoPolicyElement =
		     autoPolicyDoc.getAutomobilePolicy();
		   System.out.println("date is " + autoPolicyElement.getInsuranceDate());
		   
		   autoPolicyElement.getPolicyholderInformation().getName();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  }
}
