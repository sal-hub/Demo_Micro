package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellhomeworkPOM {

		WebDriver driver;	
		public DellhomeworkPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		//@FindBy(xpath="/html/head/script[26]")
		@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a")
				
		WebElement click_contactus;
		public WebElement contactus(){
	    return click_contactus;
		
		}
	}		

// *[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a
//a[@href=\"//www.dell.com/en-us/lp/contact-us\"]")