package com.cashkaro.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

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

	@AfterMethod
	public void afterTest() throws IOException{
		String screenhotname 		= textinput.InputValueof("ScreenshotName");
		WindowsHelper page = new WindowsHelper(driver);
		page.takeScreenShot(screenhotname);
		page.closewindow();
		
		
	}
	 
}