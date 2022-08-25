package com.nexttechitc.Pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DellActionPOM {
	WebDriver driver;
	public DellActionPOM (WebDriver driver) {		                                  
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span")
	   WebElement Click_Allsolution;
	   public WebElement Allsolution(){
	   return Click_Allsolution; 

	   
  }	   
	   @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/a")
	   WebElement Click_Viewallsolutions;   
	   public WebElement ViewAllsolution() {
	   return Click_Viewallsolutions;
	   }   
	   
	}
	
	
	
// //*[@id="u_0_o_WV"]/span[1]/label	
	