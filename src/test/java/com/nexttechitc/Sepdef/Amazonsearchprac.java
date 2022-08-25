package com.nexttechitc.Sepdef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonsearchpracPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearchprac {

	WebDriver driver;
	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
	  //Open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
         //how to open URL
		  driver.get("https://www.amazon.com.");
		  
		 // Maximize window
           driver.manage().window().maximize();
    }
	
	@When("^user writes \"([^\"]*)\" and click search icon$")
	public void user_writes_and_click_search_icon(String arg1) throws Throwable {
		AmazonsearchpracPOM obj=new AmazonsearchpracPOM(driver);
		obj.typeamazonsearch().sendKeys(arg1);
		AmazonsearchpracPOM obj1=new AmazonsearchpracPOM(driver);
		 obj1.searchicon().click();
			
		Thread.sleep(3000);
	}
		//obj1.Amazonsearchicon().click();
	     
		//explicit 
	   // WebDriverException wait=new WebDriverException();
		
		
	@Then("^User should able to the get  the expected results$")
		public void user_should_able_to_the_get_the_expected_results() throws Throwable {
	
 }

}
