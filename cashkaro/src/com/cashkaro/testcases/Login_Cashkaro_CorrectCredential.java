package com.cashkaro.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;

import org.testng.Assert;

public class Login_Cashkaro_CorrectCredential {
	
	private WebDriver driver;
	InputValues textinput = new InputValues();
	
	@Test
	private void checkValidUser(){
		Login_Page login = new Login_Page(driver);
		login.Click_siginButton();
		login.Select_LoginFrame();
		login.Enter_cashkarocred(textinput.InputValueof("LoginID_valid"), textinput.InputValueof("password_valid"));
		login.Click_LoginSubmitButton();
		String Expected_HelloMessage = "Hello " +(textinput.InputValueof("username"))+ "," ;
		String Actual_HelloMessage = login.Verify_LoginSuccess();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	}
	
	@BeforeMethod
	 public void beforeTest() {
	  driver = BrowserFactory.startBrowser("firefox",textinput.InputValueof("UrlHome"));
	 }
	 
}