package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper.Object_repositoryReader;


public class ForgotPassword_page {

	WebDriver driver;
	Object_repositoryReader Locators = new Object_repositoryReader("ForgotPassword_page.xml");
	
	
	By ForgotPassword_popuplink		 = By.cssSelector(Locators.getlocation("ForgotPassword_popuplink"));
	By EmailID_TextBox				 = By.id(Locators.getlocation("EmailID_TextBox"));
	By SubmitButton					 = By.id(Locators.getlocation("SubmitButton"));
	By SentText						 = By.cssSelector(Locators.getlocation("SentText"));
	
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
