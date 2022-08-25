package com.nexttechitc.Sepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellAction1POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction1 {
	WebDriver driver;
	@Given("^users will go to Dell homepage$")
	public void users_will_go_to_Dell_homepage() throws Throwable {
		try {
			// how to open browser   
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  
			//implicit wait
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		    // how to open URL
			  driver.get("https://www.Dell.com/");
			
			//Maximize Window
			  driver.manage().window().maximize();  
				 Thread.sleep(4000);
			}
			catch(Exception e) {
		    	System.out.println("browser and url not opening");
			}   
		}
	

	@When("^users will get Solutions dropdown menu and able to see View All Solutions$")
	public void users_will_get_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		Actions act=new Actions(driver);
        DellAction1POM obj=new DellAction1POM(driver);
        act.moveToElement(obj.Solutions()).build().perform();
        obj.CloudSolutios().click();
        obj.ViewAllCloudSolutions().click();
	}
	@Then("^user get to see the solution portfolio$")
	public void user_get_to_see_the_solution_portfolio() throws Throwable {
	    
	}

}
