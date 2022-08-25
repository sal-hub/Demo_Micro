package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomedepotPOM {
	WebDriver driver;
	
public HomedepotPOM  (WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
}
		@FindBy(xpath="//*[@id=\"headerSearch\"]")
				WebElement type_homedepotsearch;

				public WebElement typehomedepotsearch() {
					return type_homedepotsearch;
				}

				
				 @FindBy(xpath="//*[@id=\"headerSearchButton\"]")
				  WebElement click_searchicon;
				  public WebElement searchicon() {
				  return click_searchicon;



}
}
