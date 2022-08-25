package com.nexttechitc.Sepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.GmailRPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailR {
	WebDriver driver;
	private CharSequence NextTechITC;
	@Given("^User goes to Google homepage\\.$")
	public void user_goes_to_Google_homepage() throws Throwable {
		try {
	    	
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("http://www.google.com.");
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println("Browser or URL is not opening!!!");
	}
}



	@When("^User writes in searchbar valid \"([^\"]*)\" and presses enter key and scrolls down and clicks on the write a review button$")
	public void user_writes_in_searchbar_valid_and_presses_enter_key_and_scrolls_down_and_clicks_on_the_write_a_review_button(String arg1) throws Throwable {
		try {
			GmailRPOM obj1=new GmailRPOM(driver);
			obj1.type_searchbar().sendKeys(arg1);
			obj1.type_searchbar().sendKeys(Keys.ENTER);
			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(0,700)", "");
			obj1.click_write_a_review().click();

		}
	
			catch(Exception e) {
				System.out.println("Google search for write a review not working!!");
			}   
	}


	@When("^User type valid \"([^\"]*)\" and \"([^\"]*)\" and click$")
	public void user_type_valid_and_and_click(String arg1, String arg2) throws Throwable {
		
		try {
			GmailRPOM obj1 = new GmailRPOM (driver);
			
			obj1.type_email().sendKeys(arg1);
			obj1.type_email().sendKeys(Keys.ENTER);
			WebDriverWait wait4=new WebDriverWait(driver,20);
			obj1.type_password().sendKeys(arg2);
			obj1.type_password().sendKeys(Keys.ENTER);
			WebDriverWait wait5=new WebDriverWait(driver,20);
		
		}
		
		catch(Exception e) {
			System.out.println("Google sign is not working!!");
		}  
	}

		
	@Then("^User clicks the rating star and writes \"([^\"]*)\" and clicks on the post button to post a review successfully$")
	public void user_clicks_the_rating_star_and_writes_and_clicks_on_the_post_button_to_post_a_review_successfully(String arg1) throws Throwable {
		try {   
		GmailRPOM obj1 = new 	GmailRPOM (driver);
		obj1.click_rating_star().click();
		obj1.click_write_a_review().sendKeys(arg1);
		WebDriverWait wait1=new WebDriverWait(driver,20);
	     driver.quit();
		}
		catch(Exception e) {
			   System.out.println("Unable to post Google Review !!");
		 }
	}

}
