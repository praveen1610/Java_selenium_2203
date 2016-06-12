package com.cashkaro.testcases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.cashkaro.pages.LoginPage;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;


public class Login_WrongCredential {

	    private WebDriver driver;
	    String TestcaseName = getClass().getSimpleName().toString();
	    
		//Input data for test case are got from properties file in resource folder
		//Properties file is processed through InputValues Class in Helper Package
		InputValues textinput = new InputValues("Login_WrongCredential.properties");
		
		@Test
		private void checkValidUser(){
			String Wrong_Username	=	textinput.inputValueof("LoginID_wrong");
			String Wrong_Password 	= 	textinput.inputValueof("password_wrong");
			String Expected_ErrorMessage = textinput.inputValueof("ErrorMsg_invalidcred");
			
			LoginPage login = new LoginPage(driver,TestcaseName);
			login.click_siginButton();
			login.select_LoginFrame();
			login.Enter_cashkarocred(Wrong_Username,Wrong_Password);
			login.click_LoginSubmitButton();
			String Actual_ErrorMessage = login.verify_ErrorMessage();
			AssertJUnit.assertEquals(Actual_ErrorMessage, Expected_ErrorMessage);
		}
		
		@Parameters({ "Browser" })
		@BeforeMethod
		 public void beforeTest(String Browser) {
			String URL	=	textinput.inputValueof("UrlHome");
		  driver = BrowserFactory.startBrowser(Browser,URL);
		 }
		 
	 	@AfterMethod
			public void afterTest() throws IOException{
				String screenhotname 		= textinput.inputValueof("ScreenshotName");
				WindowsHelper page = new WindowsHelper(driver,TestcaseName);
				page.takeScreenShot(screenhotname);
				page.closewindow();
				
				
			}
	 	
	}
