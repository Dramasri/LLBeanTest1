package com.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
   public static WebDriver driver;
		
	
	
	@Before
	
	public static void launch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Photon\\LLBeanTestCases\\Chromed\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		
	}
	
	@After
	
	public static void quit() {
		
		driver.quit();
		
	}
	
	
	

}
