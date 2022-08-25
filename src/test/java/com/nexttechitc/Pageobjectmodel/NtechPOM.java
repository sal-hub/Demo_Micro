package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NtechPOM {

	WebDriver driver;
	  
//Create a constructor to access code from class to another class		
		
	public NtechPOM(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
		}

@FindBy(xpath="/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[1]/div/span/svg/path")
WebElement type_Ntechsearch;
public WebElement typeNtechsearch() {
return type_Ntechsearch;
 }
@FindBy(xpath="/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/button/div/span/svg")
WebElement click_searchicon;
public WebElement typeNtech(){
	return click_searchicon;
	}

	
public WebElement Ntechsearchicon() {
	// TODO Auto-generated method stub
	return null;
}
}
  


