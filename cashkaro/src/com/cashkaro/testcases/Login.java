package com.cashkaro.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cashkaro.pages.Login_Page;

import Helper.BrowserFactory;

public class Login {
	
	private WebDriver driver;
	@Test
	private void checkValidUser(){
	
		Login_Page login = new Login_Page(driver);
		login.Click_siginButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By facebookemail_logins	 = By.xpath("//div[@id='cboxLoadedContent']/iframe");
		WebElement facebookemail_login = driver.findElement(facebookemail_logins);
		driver.switchTo().frame(facebookemail_login);
		
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("testing");
		}
	
	@BeforeMethod
	 public void beforeTest() {
	  driver = BrowserFactory.startBrowser("firefox","http://cashkaro.iamsavings.co.uk/");
	 }
	 
}
