package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextRPOM {
	 
	WebDriver driver;
	
		public NextRPOM(WebDriver driver) {
			this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@class=\"gLFyf gsfi\"]")
		WebElement Google_searchbar;
		public WebElement Google_searchbar() {
			return Google_searchbar;	
		}
		
		@FindBy(xpath="/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input")
		WebElement click_google_searchicon;
		public WebElement google_searchicon() {
			return click_google_searchicon;	
		}

		@FindBy(xpath="//*[@id=\"wrkpb\"]/span/span")
		WebElement Write_review;
		public WebElement Write_review() {
			return Write_review;
			
		}

		@FindBy(xpath="//input[@type=\"email\"]")
		WebElement type_email;
		public WebElement type_email() {
			return type_email;
		}
		@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
		WebElement click_next;
		public WebElement click_next() {
			return click_next;
		}

		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement type_Password;
		public WebElement type_Password() {
		return type_Password;

		}
		@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/div[3]")
		WebElement click_nextButton;
		public WebElement click_nextButton() {
			return click_nextButton;
		}


		@FindBy(xpath="//div[@aria-label=\"Five stars\"]")
		WebElement click_rating_star;
		public WebElement click_rating_star() {
			return click_rating_star;
		}

		@FindBy(xpath="//textarea[@rows=\"3\"]")
		WebElement type_review;
		public WebElement type_review() {
			return type_review;
		}	
		}
	



		
		
		
		
		
		
		
		////*[@id="tsf"]/div[1]/div[1]/div[2]/div/div[2]/input
////*[@id="tsf"]/div[1]/div[1]/div[2]/button/div/span/svg


////*[@id="tsf"]/div[1]/div[1]/div[2]/button/div/span/svg/path