package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DellAction1POM {

	
	WebDriver driver;
	public DellAction1POM (WebDriver driver) {				                                  
	this.driver=driver;
	PageFactory.initElements(driver, this);   }
	   
	
	
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span")
	   WebElement Click_Solutions;
	   public WebElement Solutions(){
	   return Click_Solutions; 
	   }
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/button")
	   WebElement click_CloudSolutions;
	   public Object ViewAllCloudSolution;
	   public WebElement CloudSolutios(){
	   return click_CloudSolutions; 
	   }
		@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a")
	   
		WebElement Click_ViewAllCloudSolutions;   
		public WebElement ViewAllCloudSolutions() {
		return Click_ViewAllCloudSolutions;
		
	 }		   
  }

		


///html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span
// 
//*[@id="unified-masthead-navigation"]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a