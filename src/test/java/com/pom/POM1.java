package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.step.Hook;

public class POM1 {
	
	public POM1() {
		
		
		PageFactory.initElements(Hook.driver, this);
		
	}
	
	
	
	@FindBy(xpath="//a[@href='https://global.llbean.com/shop/Home-Goods/31']")
	
	WebElement move;
	
	
	
	@FindBy(xpath="//p[text()='Bedding']")
	
	WebElement bed;
	
	
	
	@FindBy(xpath="//div[@id='back-to-top']")
	
	private WebElement scrllDwn;



	public WebElement getScrllDwn() {
		return scrllDwn;
	}



	public WebElement getMove() {
		return move;
	}



	public WebElement getBed() {
		return bed;
	}
	
	
	
	
	
			
			
	
	
	
	

}
