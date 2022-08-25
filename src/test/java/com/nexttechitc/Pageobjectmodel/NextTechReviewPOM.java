package com.nexttechitc.Pageobjectmodel;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class NextTechReviewPOM {
	
		WebDriver driver;
		public NextTechReviewPOM (WebDriver driver) {	
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="q")
		WebElement type_search_bar;
		public WebElement type_search_bar() {
			return type_search_bar;
		}
		
		@FindBy(id="wrkpb")
		WebElement click_write_a_review;
		public WebElement click_write_a_review() {
			return click_write_a_review;
	}
		
		@FindBy(xpath="//*[@id=\"identifierId\"]")
		WebElement type_email_or_phone;
		public WebElement type_email_or_phone() {
			return type_email_or_phone;	
		}
		
		@FindBy(name="password")
		WebElement type_password;
		public WebElement type_password() {
			return type_password;
		}
		
		@FindBy(xpath="//*[@id=\"kCvOeb\"]/div[1]/div[3]/div/div[2]/div/div[5]")
		WebElement click_rating_star;
		public WebElement click_rating_star() {
			return click_rating_star;
		}
		
		@FindBy(id="Yc71gb")
		WebElement write_review_text_box;
		public WebElement write_review_text_box() {
			return write_review_text_box;
		}
		
		@FindBy(xpath="//*[@id=\"ZRGZAf\"]/span")
		WebElement click_post;
		public WebElement click_post() {
			return click_post;
		}
	}



	