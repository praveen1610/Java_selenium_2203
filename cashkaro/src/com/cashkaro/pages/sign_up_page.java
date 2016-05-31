package com.cashkaro.pages;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sign_up_page {
	
	WebDriver driver;
	/*
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("Xpathstorage.properties");
	prop.load(Xpathstorage.properties); */
	
	By facebookemail_login	 = By.xpath("//input[@id='email']");
	By facebook_password	 = By.xpath("//input[@id='pass']");
    By facebook_loginButton  = By.xpath("//input[@value='Log In']");
    By facebook_JoinWith 	 = By.xpath("//a[@id='close_and_go_fb']");
   
	/*By facebookemail_login	 = By.xpath(facebookemail_login);
	By facebook_password	 = By.xpath(facebook_password);
    By facebook_loginButton  = By.xpath(facebook_loginButton);
    By facebook_JoinWith 	 = By.xpath(facebook_JoinWith);*/

	public sign_up_page(WebDriver driver){
		this.driver = driver;
	}
	
	public void Type_loginFacebookcred(String username, String password){
		driver.findElement(facebookemail_login).sendKeys(username);
		driver.findElement(facebook_password).sendKeys(password);
	}
	
	public void ClickOnLoginButton(){
		driver.findElement(facebook_loginButton).click();
	}
	public void ClickJoinWithFBButton(){
		String mainHandle= driver.getWindowHandle();
		
		driver.findElement(facebook_JoinWith).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		     if (driver.getTitle().equals("Facebook")){
		    	 break; 
			 }
		  }
	}

}
