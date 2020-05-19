package com.testrun;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	
	
	public static void reports(String json) {
		
		
		File f = new File("D:\\Photon\\LLBeanTestCases\\JSONReports");
		
		Configuration con = new Configuration(f, "Reports");
		
		con.addClassifications("sprint", "13");
		
		con.addClassifications("reports", "final");
		
		con.addClassifications("chrome", "google");
		
		
		
		List<String> li = new LinkedList<String>();
		
		li.add(json);
		
		ReportBuilder rt = new ReportBuilder(li, con);
		
		rt.generateReports();
		
		
		
	}
	
	
	
	
	

}
