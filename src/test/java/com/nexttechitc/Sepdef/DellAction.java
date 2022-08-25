package com.nexttechitc.Sepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

WebDriver driver;	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
     
		try {
		// how to open browser?   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();

	    // how to open URL
		  driver.get("https://www.Dell.com/");
		
		//Maximum window
			driver.manage().window().maximize();  
			 Thread.sleep(3000);
		}
		catch(Exception e) {
	    	System.out.println("element not found exception");
		}   
	}
	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    	Actions act=new Actions(driver);
	        DellActionPOM obj=new DellActionPOM(driver);
	        act.moveToElement(obj.Allsolution()).build().perform();
	        obj.ViewAllsolution().click();
}
       @Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}	
}
