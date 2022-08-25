package com.nexttechitc.Sepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.DellAction1POM;
import com.nexttechitc.Pageobjectmodel.FBsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignup {
	WebDriver driver;
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		try {
			// how to open browser?   
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();

		    // how to open URL
			  driver.get("https://www.facebook.com/reg"); 
			  		
			//Maximum window
				driver.manage().window().maximize();  
				 Thread.sleep(3000);
			}
			catch(Exception e) {
		    	System.out.println("Browser and URL  not opening");
			}   
		}  
	

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	try {	  
		FBsignupPOM ab= new FBsignupPOM(driver);
		ab.firstname().sendKeys(arg1);
		ab.lastname().sendKeys(arg2);
		ab.phone().sendKeys(arg3);
		ab.password().sendKeys(arg4);
	}	
	
	catch(Exception e) {
		System.out.println("element not found exception");
	}
}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	
		try {
		FBsignupPOM ab= new FBsignupPOM(driver);
		Select dropdown=new Select (ab.click_month);
		dropdown.selectByIndex(5);
		Thread.sleep(3000);
		
		Select dropdown1=new Select (ab.click_day);
		dropdown1.selectByValue("6");
		//Thread.sleep(3000);
		
		Select dropdown2=new Select (ab.click_year);
	    dropdown2.selectByVisibleText("1991");
	   // Thread.sleep(3000);
	    ab.Gender_Female().click();
	
	    Thread.sleep(2000);	
		}
		catch(Exception e) {
			
		}
			System.out.println("Input not recieved!!");
	}
}

	 	   
	    
	



