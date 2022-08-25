package com.nexttechitc.Sepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.NextRPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NextR {

	WebDriver driver;
	@Given("^User visits  Google homepage\\.$")
	public void user_visits_Google_homepage() throws Throwable {
		 try {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://www.google.com/");
				
				driver.manage().window().maximize();

				Thread.sleep(3000);
		    }
		    catch(Exception e) {
		    	System.out.println("Browser and URL are not opening");
		    }
              	}
   
	@When("^User writes in search bar valid \"([^\"]*)\" and presses enter key$")
	public void user_writes_in_search_bar_valid_and_presses_enter_key(String arg1, WebDriverWait WebDriverWait) throws Throwable {
	
		    try {
		    	NextRPOM obj=new NextRPOM(driver);
		    	obj.Google_searchbar().sendKeys(arg1);
		    	obj.google_searchicon().click();
		    	WebDriverWait=new WebDriverWait(driver,20);
		    	}
		    	
			 catch(Exception e) {
		    	System.out.println("Search bar is not working");
		    }
		  }	
	

	@When("^User scrolls down and r clicks on the write a review button$")
	public void user_scrolls_down_and_r_clicks_on_the_write_a_review_button() throws Throwable {
		
		try {	
			 NextRPOM obj= new NextRPOM(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,500)", ""); //scroll down,
    	new WebDriverWait(driver,20);
    }
    catch(Exception e) {
    	System.out.println("Scroll down error");
  }
}

	
	@When("^User type valid \"([^\"]*)\" and click next button and type valid \"([^\"]*)\" and click$")
	public void user_type_valid_and_click_next_button_and_type_valid_and_click(String arg1, String arg2) throws Throwable {
       try {
		NextRPOM obj=new NextRPOM(driver);
		obj.Write_review().click();
		obj.type_email().sendKeys(arg1);
		obj.click_next().click();
		obj.type_Password().sendKeys(arg2);
		obj.click_nextButton().click();
    	new WebDriverWait(driver,20);
       }
       catch(Exception e) {
	    	System.out.println("Google account is not sign in");}
	    }


	@When("^User clicks the rating star and writes \"([^\"]*)\" and clicks on the post button\\.$")
	public void user_clicks_the_rating_star_and_writes_and_clicks_on_the_post_button(String arg1) throws Throwable {
		try {
			
			NextRPOM obj=new NextRPOM(driver);
			obj.click_rating_star().click();
			obj.type_review().sendKeys(arg1);
		new WebDriverWait(driver,20);
		}
		
		
		catch(Exception e) {
		    	System.out.println("Review page is not opening");
		    }
	}

	@Then("^User will redirect to post reviews successfully$")
	public void user_will_redirect_to_post_reviews_successfully() throws Throwable {
		driver.quit();    
	}


}