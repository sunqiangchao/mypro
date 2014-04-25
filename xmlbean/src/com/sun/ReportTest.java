package com.sun;

import java.io.File;

import com.cinsa.report.BaseSectionType;
import com.cinsa.report.ReportDocument;
import com.cinsa.report.ReportDocument.Report;


public class ReportTest {
	public static void main(String[] args) {
		

		  try {
		   String filePath = "test.xml";
		   java.io.File inputXMLFile = new java.io.File(filePath);
		   
		   ReportDocument rd = ReportDocument.Factory.parse(inputXMLFile);
		   
		   Report report = rd.getReport();
		   
		  String logpath =  report.getReportTitle().getHeader().getLogoPath();
		   System.out.println(logpath);
		   System.out.println("----------------------------------------");
		   
		int i =  report.getReportBody().getSectionArray(0).sizeOfSubSectionArray();
		String title = report.getReportBody().getSectionArray(0).getSubSectionArray(0).getTitle();
		   
		String s = report.getReportBody().getSectionArray(0).getParagraphArray(0).getTitle();
		BaseSectionType type = report.getReportBody().getSectionArray(0).getParagraphArray(1);
		
		System.out.println(s);
		   System.out.println(title);
		   
		   
		   ReportDocument doc = ReportDocument.Factory.newInstance();
		   
		   Report rep = doc.addNewReport();
		  
		   rep.addNewReportTitle();
		   rep.addNewReportBody();
		   
		   doc.save(new File("newtest.xml"));
		   
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  
		
		
		
		
		
		
	}
}
