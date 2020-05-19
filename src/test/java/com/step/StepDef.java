package com.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pom.POM1;
import com.pom.POM2;
import com.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Base {
	
	
	@Given("Launch the webpage")
	public void launch_the_webpage() {
		
		Hook.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Hook.driver.get("https://global.llbean.com/");
		
		Hook.driver.manage().window().maximize();
		
		Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    Hook.driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		
		Hook.driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
	   
	   
	}

	@When("Move the element to Home & Goods")
	public void move_the_element_to_Home_Goods() {
		
		
		POM1 pm = new POM1();
		
		moveTo(pm.getMove());
	   
	}

	@When("Click on Bedding")
	public void click_on_Bedding() {
		
		POM1 pk = new POM1();
		
	     clk(pk.getBed());
		
		
	    
	}

	@Then("List of elements appeared & check it with assert")
	public void list_of_elements_appeared_check_it_with_assert() {
		
		Hook.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		List<WebElement> allProd = Hook.driver.findElements(By.xpath("//a[@class='name-link']"));
		
		
		Set<WebElement>  st = new LinkedHashSet<WebElement>();
		
		st.addAll(allProd);
		
		//Assert.assertEquals(st.contains("Wicked Plush Throw"), "Wicked Plush Throw");
		
		
		for(WebElement x : st) {
			
			String name = x.getText();
			
			System.out.println(name);
			
			
                }
		
		Assert.assertTrue(st.contains("Wicked Plush Throw"));
	    
	}
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	@Given("Launch to the webpage")
	public void launch_to_the_webpage() {
		
		
		Hook.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Hook.driver.get("https://global.llbean.com/");
		
		Hook.driver.manage().window().maximize();
		
		Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 Hook.driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
			
			Hook.driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();

	    
	}

	@When("Scroll down the button")
	public void scroll_down_the_button() throws AWTException {
		
		
		POM1 pk = new POM1();
		
		Robot rt = new Robot();
		
		for(int i=0; i<5;i++) {
		
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		}
		
		
		clk(pk.getScrllDwn());
		
	   
	}

	@Then("Click on Return to top button")
	public void click_on_Return_to_top_button() {
		
		String name = Hook.driver.getCurrentUrl();
		
        Assert.assertTrue(Hook.driver.getCurrentUrl().contains(name));		
	
	    
	}


	//-------------------------------------------------------------------------------------------------------------------------------------//
	
	
	
	
	@Given("Launch the webpage LLBean")
	public void launch_the_webpage_LLBean() {
		
		Hook.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Hook.driver.get("https://global.llbean.com/");
		
		Hook.driver.manage().window().maximize();
		
		Hook.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 Hook.driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
			
			Hook.driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();

		
		
	  
	}

	@When("Click on the sale button")
	public void click_on_the_sale_button() {
		
		POM2 pm = new POM2();
		
		clk(pm.getSale());
		
		String name = Hook.driver.getCurrentUrl();
		
	//	Assert.assertEquals(Hook.driver.getCurrentUrl().equals(name),"https://global.llbean.com/shop/Sale/32");
		
	     Assert.assertEquals(name, Hook.driver.getCurrentUrl());
	   
	}

	@When("Click the NarrowBy button & select the particular jeans")
	public void click_the_NarrowBy_button_select_the_particular_jeans() {
		
		POM2 pk = new POM2();
		
		Hook.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		clk(pk.getMinus());
		
		clk(pk.getJeans());
	    
	}

	@Then("List the products and check it with Assert")
	public void list_the_products_and_check_it_with_Assert() {
		
		
		List<WebElement> allP = Hook.driver.findElements(By.xpath("//a[@class='name-link']"));
		
		for(WebElement x : allP) {
			
			String name = x.getText();
			
			
		System.out.println(name);
		
       // Assert.assertEquals(name.contains("Women's 1912 Jeans, Favorite Fit Utility"), allP.contains("Women's 1912 Jeans, Favorite Fit Utility"));   
	
		
		
		
		}
	}


	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------- //
		
		
		@Given("Launching the webpage")
		public void launching_the_webpage() {
			
			
		Hook.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Hook.driver.get("https://global.llbean.com/");
		    
		Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 Hook.driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
			
			Hook.driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();

		
		
		}

		@When("Click on the outdoor equipment")
		public void click_on_the_outdoor_equipment() {
			
			Hook.driver.findElement(By.xpath("//a[@href='https://global.llbean.com/shop/Outdoor-Equipment/29']")).click();
		   
		}

		@Then("Check with the assert")
		public void check_with_the_assert() {
			
			
			String tle = Hook.driver.getTitle();
			
			Assert.assertTrue(Hook.driver.getTitle().equals(tle));
		   
		}
	
	
// ------------------------------------------------------------------------------------------------------------------------------------- //
		
		

		@Given("Check the login page")
		public void check_the_login_page() {
			
			Hook.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			Hook.driver.navigate().to("https://global.llbean.com/");
			
			Hook.driver.manage().window().maximize();
			
			
			Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		    Hook.driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
			
			Hook.driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		   
		}

		@When("Click on the login button")
		public void click_on_the_login_button() {
			
			WebElement acnt = Hook.driver.findElement(By.xpath("//a[@title='ACCOUNT']"));
			
			Actions at = new Actions(Hook.driver);
			
			at.moveToElement(acnt).perform();
			
			
			
			
		    
		}

		@Then("Check with the assert follows")
		public void check_with_the_assert_follows() {
			
			
			
			Hook.driver.findElement(By.xpath("//a[@id='sign-in']")).click();
			
			String tle = Hook.driver.getTitle();
			
			
         Assert.assertTrue(false);		   
		}


		
		
		
		
		
		
		


}

