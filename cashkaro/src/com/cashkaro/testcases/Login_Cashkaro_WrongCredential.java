package com.cashkaro.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;

import org.testng.Assert;
public class Login_Cashkaro_WrongCredential {

	    private WebDriver driver;
		InputValues textinput = new InputValues();
		
		@Test
		private void checkValidUser(){
			Login_Page login = new Login_Page(driver);
			login.Click_siginButton();
			login.Select_LoginFrame();
			login.Enter_cashkarocred(textinput.InputValueof("LoginID_wrong"), textinput.InputValueof("password_wrong"));
			login.Click_LoginSubmitButton();
			String Expected_ErrorMessage = textinput.InputValueof("ErrorMsg_invalidcred");
			String Actual_ErrorMessage = login.Verify_ErrorMessage();
			Assert.assertEquals(Actual_ErrorMessage, Expected_ErrorMessage);
		}
		
		@BeforeMethod
		 public void beforeTest() {
		  driver = BrowserFactory.startBrowser("firefox",textinput.InputValueof("UrlHome"));
		 }
		 
	}
