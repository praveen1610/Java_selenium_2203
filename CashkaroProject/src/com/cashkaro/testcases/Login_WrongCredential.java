package com.cashkaro.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;

import org.testng.Assert;
public class Login_WrongCredential {

	    private WebDriver driver;
		InputValues textinput = new InputValues("Login_WrongCredential.properties");
		
		@Test
		private void checkValidUser(){
			String Wrong_Username	=	textinput.InputValueof("LoginID_wrong");
			String Wrong_Password 	= 	textinput.InputValueof("password_wrong");
			String Expected_ErrorMessage = textinput.InputValueof("ErrorMsg_invalidcred");
			
			Login_Page login = new Login_Page(driver);
			login.Click_siginButton();
			login.Select_LoginFrame();
			login.Enter_cashkarocred(Wrong_Username,Wrong_Password);
			login.Click_LoginSubmitButton();
			String Actual_ErrorMessage = login.Verify_ErrorMessage();
			Assert.assertEquals(Actual_ErrorMessage, Expected_ErrorMessage);
		}
		
		@Parameters({ "Browser" })
		@BeforeMethod
		 public void beforeTest(String Browser) {
			String URL	=	textinput.InputValueof("UrlHome");
		  driver = BrowserFactory.startBrowser(Browser,URL);
		 }
		 
	}