package com.pom;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.Hook;

public class POM2 {
	
	public POM2() {
		
		PageFactory.initElements(Hook.driver, this);
		

}
	
public WebElement getSale() {
		return sale;
	}


	public WebElement getMinus() {
		return minus;
	}


	public WebElement getJeans() {
		return jeans;
	}

@FindBy(xpath="//img[@alt='Sale Banner']")

   private WebElement sale;


@FindBy(xpath="(//span[@class='plusSign minusSign'])[1]")

private WebElement minus;


@FindBy(xpath="(//span[@class='unChecked'])[3]")

private WebElement jeans;



	
	
	
	
	
}
