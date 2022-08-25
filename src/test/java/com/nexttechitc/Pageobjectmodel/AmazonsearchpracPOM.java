package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchpracPOM {

WebDriver driver;
	public AmazonsearchpracPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement type_amazonsearch;
	public WebElement typeamazonsearch() {
		return type_amazonsearch;
	}

	
	 @FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	  WebElement click_searchicon;
	 public WebElement searchicon() {
		return click_searchicon;
		}
	

}		
   
	
