package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper.Object_repositoryReader;

public class Sign_up_page {
	
	WebDriver driver;
	Object_repositoryReader Locators = new Object_repositoryReader("sign_up_page.xml");
	
	By facebookemail_login	 = By.xpath(Locators.getlocation("facebookemail_login"));
	By facebook_password	 = By.xpath(Locators.getlocation("facebook_password"));
    By facebook_loginButton  = By.xpath(Locators.getlocation("facebook_loginButton"));
    By facebook_JoinWith 	 = By.xpath(Locators.getlocation("facebook_JoinWith"));
    By facebook_ConfirmSubmit = By.name(Locators.getlocation("facebook_ConfirmSubmit"));
    By JoinNow_HeaderButton	=	By.linkText(Locators.getlocation("JoinNow_HeaderButton"));
    
    
    public Sign_up_page(WebDriver driver){
		this.driver = driver;
	}
  	
  	public void click_JoinNowButton(){
  		driver.findElement(JoinNow_HeaderButton).click();
  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	}
	
	public void type_loginFacebookcred(String username, String password){
		driver.findElement(facebookemail_login).sendKeys(username);
		driver.findElement(facebook_password).sendKeys(password);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(facebook_loginButton).click();
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		    }
	}
	
	public void clickJoinWithFBButton(){
		driver.findElement(facebook_JoinWith).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		    }
	}

	public void click_FBokayButton(){
		driver.findElement(facebook_ConfirmSubmit).click();
	}
}
