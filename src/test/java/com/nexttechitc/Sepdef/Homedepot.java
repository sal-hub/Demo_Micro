package com.nexttechitc.Sepdef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.HomedepotPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homedepot {
	WebDriver driver;
	@Given("^user visit Homedepot homepage$")
	public void user_visit_Homedepot_homepage() throws Throwable {
	
		//try {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");   
	driver=new ChromeDriver();

	//how to open URL
	driver.get("https://www.Homedepot.com/");
	Thread.sleep(3000);
	//Maximum window
	driver.manage().window().maximize();
	}
	
    //catch (Exception e) {
	//	System.out.println("browser does not open");
	//}
	//}
 	
	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
		HomedepotPOM obj=new HomedepotPOM (driver);
	    obj.typehomedepotsearch().sendKeys(arg1);
	    obj.searchicon().click();
	    
	}

	// TODO Auto-generated method stub

   @Then("^User should see expected product$")
	public void user_should_see_expected_product() throws Throwable {
	    
}
}