package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper.Locator_repositoryReader;

public class SignUpPage {
	String TestCaseName;
	WebDriver driver;
	Logger log = Logger.getLogger("Sign_up_page");
	
	//All the locations like xpath, id are present in XML file in folder LocationRepository
	//Locator_repositoryReader Helper class proccess this XML and give the location as string
	Locator_repositoryReader Locators = new Locator_repositoryReader("sign_up_page.xml");
	
	By facebookemail_login	 = By.xpath(Locators.getlocation("facebookemail_login"));
	By facebook_password	 = By.xpath(Locators.getlocation("facebook_password"));
    By facebook_loginButton  = By.xpath(Locators.getlocation("facebook_loginButton"));
    By facebook_JoinWith 	 = By.xpath(Locators.getlocation("facebook_JoinWith"));
    By facebook_ConfirmSubmit = By.xpath(Locators.getlocation("facebook_ConfirmSubmit"));
    By JoinNow_HeaderButton	=	By.linkText(Locators.getlocation("JoinNow_HeaderButton"));
    
    
    public SignUpPage(WebDriver driver,String TestCaseName){
		this.driver = driver;
		this.TestCaseName = TestCaseName;
	}
  	
  	public void click_JoinNowButton(){
  		try{
  		driver.findElement(JoinNow_HeaderButton).click();
  		log.info(TestCaseName+ " Clicked on Join Now Button");
  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	catch (Exception e){
		log.error(TestCaseName+ " " +e);
	}
  	}
	
	public void type_loginFacebookcred(String username, String password){
		try{
		driver.findElement(facebookemail_login).sendKeys(username);
		log.info(TestCaseName+ " Clicked on facebook email_login Button");
		driver.findElement(facebook_password).sendKeys(password);
	}
	catch (Exception e){
		log.error(TestCaseName+ " " +e);
	}
	}
	
	public void clickOnLoginButton(){
		try{
		driver.findElement(facebook_loginButton).click();
		log.info(TestCaseName+ " Clicked on facebook_loginButton");
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		    }
	}
	catch (Exception e){
		log.error(TestCaseName+ " " +e);
	}
	}
	
	public void clickJoinWithFBButton(){
		try{
		driver.findElement(facebook_JoinWith).click();
		log.info(TestCaseName+ " Clicked on Join With FBButton");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		    }
	}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}

	public void click_FBokayButton(){
		try{
		driver.findElement(facebook_ConfirmSubmit).click();
		log.info(TestCaseName+ " Clicked on FB Confirm Submission button");
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	} 
}
