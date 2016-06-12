package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper.Locator_repositoryReader;


public class ForgotPassword_page {

	WebDriver driver;
	String TestCaseName;
	Logger log = Logger.getLogger("ForgotPassword_page");
	//All the locations like xpath, id are present in XML file in folder LocationRepository
	//Locator_repositoryReader Helper class proccess this XML and give the location as string
	Locator_repositoryReader Locators = new Locator_repositoryReader("ForgotPassword_page.xml");
	
	
	By ForgotPassword_popuplink		 = By.cssSelector(Locators.getlocation("ForgotPassword_popuplink"));
	By EmailID_TextBox				 = By.id(Locators.getlocation("EmailID_TextBox"));
	By SubmitButton					 = By.id(Locators.getlocation("SubmitButton"));
	By SentText						 = By.cssSelector(Locators.getlocation("SentText"));
	
	public ForgotPassword_page(WebDriver driver, String TestCaseName){
		this.driver = driver;
		this.TestCaseName = TestCaseName;
	}
	
	
	public void clickForgotPasswordLink(){
		try{
		driver.findElement(ForgotPassword_popuplink).click();
		log.info(TestCaseName+ " Forgot Password pop up link is clicked");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}

	public void enter_emailidForgotPasswordLink(String Emailid){
		try{
		driver.findElement(EmailID_TextBox).sendKeys(Emailid);
		log.info(TestCaseName+ " Email id given in Forgot Email id input box");
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}
	
	public void click_SubmitButton(){
		try{
		driver.findElement(SubmitButton).click();
		log.info(TestCaseName+ " Login Frame Submit Button");
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}
	
	public String get_Successtext(){
		try{
		String senttitle = driver.findElement(SentText).getText();
		log.info(TestCaseName+ " Sent title verification text present");
		return senttitle;
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
		return null;
		}
	}
