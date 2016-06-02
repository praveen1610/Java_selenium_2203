package com.cashkaro.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;

import org.testng.Assert;

public class Login_CorrectCredential {
	
	private WebDriver driver;
	InputValues textinput = new InputValues("Login_CorrectCredential.properties");
	
	@Test
	private void checkValidUser(){
		String Password = textinput.InputValueof("Valid_Password");
		String UserEmail = textinput.InputValueof("Valid_Emailid");
		String Expected_HelloMessage = textinput.InputValueof("Expected_HelloMessage");
		Login_Page login = new Login_Page(driver);
		login.Click_siginButton();
		login.Select_LoginFrame();
		login.Enter_cashkarocred(UserEmail, Password);
		login.Click_LoginSubmitButton();
		
		String Actual_HelloMessage = login.Verify_LoginSuccess();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	}
	
	@Parameters({ "Browser" })
	@BeforeMethod
	 public void beforeTest(String Browser) {
		String URL	=	textinput.InputValueof("UrlHome");
	  driver = BrowserFactory.startBrowser(Browser,URL);
	 }
	 
}