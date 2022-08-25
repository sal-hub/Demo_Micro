package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


      public class FBsignupPOM {
	
	WebDriver driver;
	  
//Create a constructor to access code from class to another class		
		
	  public FBsignupPOM (WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		}

@FindBy(xpath="//*[@name=\"firstname\"]")
 WebElement edit_firstname;
 public WebElement firstname() {
 return edit_firstname;
   }
 @FindBy(name="lastname")
 WebElement edit_lastname;
 public WebElement lastname() {
 return  edit_lastname;
    }
     
 @FindBy(name="reg_email__")    
	WebElement edit_phone;
	public WebElement phone() {
		 return  edit_phone;
 }
 
 @FindBy(id="password_step_input")
  WebElement edit_password;
  public WebElement password() {
  return  edit_password;
      }
     
 @FindBy(xpath="//*[@id=\"month\"]")
 public WebElement click_month;
     
 @FindBy(id="day")
 public WebElement click_day;

  @FindBy(id="year")
  public WebElement click_year;

  @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")
  WebElement Gender_Female;
  public WebElement Gender_Female() {
	  return  Gender_Female;
  }
  
}		
		



      
      
      
      
      
    //  reg_email__
      
   ////*[@id="u_3_g_G2"]   
      
////*[@id="u_0_5_Qb"]			

// //*[@id="month"]
//  //*[@id="day"]
//   //*[@id="year"] 
 ///html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label     
 //  private static final WebElement Gender_Female = null;     
     
//JavascriptExecutor jsx = (JavascriptExecutor)driver;

//jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down,
//jsx.executeScript("window.scrollBy(0,40 or 20 or 50)", ""); //scroll down,
// input#u_1v_4_3H._8esa
