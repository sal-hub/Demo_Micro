package com.nexttechitc.Sepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.NextTechReviewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NextTechReview {
	
	WebDriver driver;
	
	@Given("^user visits Google home page$")
	public void user_visits_Google_home_page() throws Throwable {
		try {
	    	//Open Browser
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open URL
		driver.get("http://www.google.com.au");
		//Maximize window
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println("Browser or URL not opening!!!");
	}
}
   

	@When("^user types \"([^\"]*)\" and press enter key and scrolls down and clicks on write a review button$")
	public void user_types_and_press_enter_key_and_scrolls_down_and_clicks_on_write_a_review_button(String arg1) throws Throwable {
		try {
			NextTechReviewPOM obj = new NextTechReviewPOM (driver);
			obj.type_search_bar().sendKeys(arg1);
			obj.type_search_bar().sendKeys(Keys.ENTER);
			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(0,700)", "");
			obj.click_write_a_review().click();
				
		}
		catch(Exception e) {
			System.out.println("Google search for write a review not working!!");
		}   
	}

	

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {

		try {
			NextTechReviewPOM obj = new NextTechReviewPOM (driver);
		
			obj.type_email_or_phone().sendKeys(arg1);
			obj.type_email_or_phone().sendKeys(Keys.ENTER);
			WebDriverWait wait3=new WebDriverWait(driver,20);
			obj.type_password().sendKeys(arg2);
			obj.type_password().sendKeys(Keys.ENTER);
			WebDriverWait wait4=new WebDriverWait(driver,20);
			
		}
		catch(Exception e) {
			System.out.println("Google sign in not working!!");
		}  
	}


	@Then("^user clicks on rating stars and types \"([^\"]*)\" and clicks on post button to post a review successfully$")
	public void user_clicks_on_rating_stars_and_types_and_clicks_on_post_button_to_post_a_review_successfully(String arg1) throws Throwable {
		try {   
			NextTechReviewPOM obj = new NextTechReviewPOM (driver);
			
			obj.click_rating_star().click();
			obj.click_write_a_review().sendKeys(arg1);
			WebDriverWait wait1=new WebDriverWait(driver,20);
			driver.quit();
	   	}  
catch(Exception e) {
			   System.out.println("Review can not be posted!!");
	  	 }

	}


}
