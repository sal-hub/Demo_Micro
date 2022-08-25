package com.nexttechitc.Sepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	
	WebDriver driver;	
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		
		  
		//Open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				
		 //how to open URL
				driver.get("https://www.amazon.com.");
				  Thread.sleep(3000);
		
					
			// Thread.sleep(5000);
             // Maximize window
              driver.manage().window().maximize();
					 
	}
 
	
	@When("^user type \"([^\"]*)\" and click search icon$")
	
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		try {
		AmazonsearchPOM obj=new AmazonsearchPOM(driver);
	  
		obj.typeamazonsearch().sendKeys(arg1);
		AmazonsearchPOM obj1=new AmazonsearchPOM(driver);
		//obj1.Amazonsearchicon().click();
		obj1.clickearch().click();
	   //explicit 
	   // WebDriverException wait=new WebDriverException();
		}
      
		catch(Exception e) {
	    System.out.println("amazon search option");
 }
 }
	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
	  //what is the difference between close & quit
		//driver.close();
		//driver.quit();
	}

}
	