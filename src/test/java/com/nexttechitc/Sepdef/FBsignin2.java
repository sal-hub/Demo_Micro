package com.nexttechitc.Sepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.FBsignin2POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBsignin2 {
WebDriver driver;
	@Given("^User will go to Face Book Homepage$")
	public void user_will_go_to_Face_Book_Homepage() throws Throwable {
		try {
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();

		    // how to open URL
			  driver.get("https://www.facebook.com/login.php"); 
			  		
			//Maximum window
				driver.manage().window().maximize();  
				 Thread.sleep(3000);
			}
			catch(Exception e) {
		    	System.out.println("Browser and URL  not opening");} 
	}

	@When("^User will write  \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void user_will_write_and_and_click_login_button(String arg1, String arg2) throws Throwable {
	   FBsignin2POM ob =new FBsignin2POM(driver); 
	   ob.Phonenumber().sendKeys(arg1);
	   ob.Password().sendKeys(arg2);
	   ob.Login().click();
	
	   WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^User should be able to sign in successfully$")
	public void user_should_be_able_to_sign_in_successfully() throws Throwable {
	   driver.quit();
	}


}
