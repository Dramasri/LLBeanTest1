package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.step.Hook;

public class Base {
	
	
	
	public static void sendKeys(WebElement w,String s) {
		
		
		
		w.sendKeys(s);
		
		
	}
	
	
	public static void clk(WebElement w) {
		
		
		w.click();
		
		
	}
	
	
	
	public static void moveTo(WebElement w) {
		
		Actions ac = new Actions(Hook.driver);
		
		ac.moveToElement(w).perform();
		
		
		
		
	}
	
	
	public static void scrllDwn(WebElement w) {
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)Hook.driver;
		
		js.executeScript("arguments[0].scrollIntoView('true')", w);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
