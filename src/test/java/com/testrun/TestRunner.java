package com.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources", glue="com.step", dryRun= false, tags= { "@Sanity , @Smoke" }, plugin= {"json:D:\\Photon\\LLBeanTestCases\\JSONReports.json" } )


public class TestRunner {
	
	@AfterClass
	
	public static void jvmReports() {
		
		
		JVMReports.reports("D:\\Photon\\LLBeanTestCases\\JSONReports.json");
		
		
	}
	
	

}
