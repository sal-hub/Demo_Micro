package com.nexttechitc.Sepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ntech {
	@Given("^User goes to  Google homepage\\.$")
	public void user_goes_to_Google_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//URL
	   driver.get("https://account.google.com/signin");
	   driver.findElement(By.id("identifierId")).sendKeys("salmahossain12@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("*****");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		// click on the profile icon
		
		//Test.click();
		 driver.quit();
	}



	
	



	@When("^User writes valid \"([^\"]*)\" and presses enter key and scrolls down and User clicks on the write a review button\\. and user clicks the rating star and writes \"([^\"]*)\" and clicks on the post button\\.$")
	public void user_writes_valid_and_presses_enter_key_and_scrolls_down_and_User_clicks_on_the_write_a_review_button_and_user_clicks_the_rating_star_and_writes_and_clicks_on_the_post_button(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^User will be able to post reviews successfully$")
	public void user_will_be_able_to_post_reviews_successfully() throws Throwable {
	    
	}


	
	
}
