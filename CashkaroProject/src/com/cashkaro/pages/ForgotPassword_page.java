package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ForgotPassword_page {

	WebDriver driver;
		
	By ForgotPassword_popuplink		 = By.cssSelector(".fl.link");
	By EmailID_TextBox				 = By.id("from_email");
	By SubmitButton					 = By.id("submit_req");
	By SentText						 = By.cssSelector(".f_pass_s>h2");
	
	
	
	public ForgotPassword_page(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void clickForgotPasswordLink(){
		driver.findElement(ForgotPassword_popuplink).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void select_ActiveFrame(){
		driver.switchTo().activeElement();
		}
	
	public void enter_emailidForgotPasswordLink(String Emailid){
		driver.findElement(EmailID_TextBox).sendKeys(Emailid);
	}
	
	public void click_SubmitButton(){
		driver.findElement(SubmitButton).click();
	}
	
	public String get_Successtext(){
		String senttitle = driver.findElement(SentText).getText();
		return senttitle;
	}
	
	
}
