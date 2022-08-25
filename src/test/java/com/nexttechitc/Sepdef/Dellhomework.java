package com.nexttechitc.Sepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.DellhomeworkPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellhomework {
	WebDriver driver;
	@Given("^user visits Dell home page$")
	public void user_visits_Dell_home_page() throws Throwable {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		

		 //how to open URL
		 driver.get("https://www.Dell.com.");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
   
	}

	@When("^user clicks on Contact Us$")
	public void user_clicks_on_Contact_Us() throws Throwable {
		  DellhomeworkPOM contactus=new DellhomeworkPOM(driver);
		  contactus.contactus().click();
  
	}

	@Then("^user should be able to redirect to the Dell Contact Us Page$")
	public void user_should_be_able_to_redirect_to_the_Dell_Contact_Us_Page() throws Throwable {
	    
	}
}


