package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	By signin_popup = By.cssSelector(".fl.signin_popupbox");
	
	WebDriver driver;

		
	public Login_Page(WebDriver driver){
		this.driver = driver;
	}
	
	public void Click_siginButton(){
		driver.findElement(signin_popup).click(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	

}
