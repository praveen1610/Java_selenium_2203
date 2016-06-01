package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sign_up_page {
	
	WebDriver driver;
	By facebookemail_login	 = By.xpath("//input[@id='email']");
	By facebook_password	 = By.xpath("//input[@id='pass']");
    By facebook_loginButton  = By.xpath("//input[@value='Log In']");
    By facebook_JoinWith 	 = By.xpath("//a[@id='close_and_go_fb']");
    By facebook_ConfirmSubmit = By.name("name=__CONFIRM__");
 
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
		driver.findElement(facebook_JoinWith).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		    }
	}

	public void Click_FBokayButton(){
		driver.findElement(facebook_ConfirmSubmit).click();
	}
}
