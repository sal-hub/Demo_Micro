package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBsignin2POM {
WebDriver driver;
    public FBsignin2POM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
    }

	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")
	 WebElement Type_Phonenumber;
	 public WebElement Phonenumber() {
	 return Type_Phonenumber;
	   }
	 @FindBy(name="//*[@id=\"pass\"]")
	 WebElement Type_Password;
	 public WebElement Password() {
	 return Type_Password ;
	    }
	     
	 @FindBy(name="//*[@id=\"loginbutton\"]")
	 WebElement Click_Login;
	 public WebElement Login() {
	 return  Click_Login; 
      
    }
}
