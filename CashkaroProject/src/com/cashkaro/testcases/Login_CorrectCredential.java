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

import org.testng.Assert;

public class Login_CorrectCredential {
	String TestcaseName = getClass().getSimpleName().toString();
	private WebDriver driver;
	
	//Input data for test case are got from properties file in resource folder
	//Properties file is processed through InputValues Class in Helper Package
	InputValues textinput = new InputValues("Login_CorrectCredential.properties");
	
	@Test
	private void checkValidUser(){
		String Password = textinput.inputValueof("Valid_Password");
		String UserEmail = textinput.inputValueof("Valid_Emailid");
		String Expected_HelloMessage = textinput.inputValueof("Expected_HelloMessage");
		
		LoginPage login = new LoginPage(driver,TestcaseName);
		login.click_siginButton();
		login.select_LoginFrame();
		login.Enter_cashkarocred(UserEmail, Password);
		login.click_LoginSubmitButton();
		String Actual_HelloMessage = login.verify_LoginSuccess();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	}
	
	@Parameters({ "Browser" })
	@BeforeTest
	 public void beforeTest(String Browser) {
	 String URL	=	textinput.inputValueof("UrlHome");
	 driver = BrowserFactory.startBrowser(Browser,URL);
	 }

	@AfterTest
	public void afterTest() throws IOException{
		String screenhotname 		= textinput.inputValueof("ScreenshotName");
		WindowsHelper page = new WindowsHelper(driver,TestcaseName);
		page.takeScreenShot(screenhotname);
		page.closewindow();
		
		
	}
	 
}