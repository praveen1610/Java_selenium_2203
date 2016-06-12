package com.cashkaro.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.cashkaro.pages.ForgotPassword_page;
import com.cashkaro.pages.LoginPage;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

public class ForgotPassword {
	private WebDriver driver;
		
	//Input data for test case are got from properties file in resource folder
	//Properties file is processed through InputValues Class in Helper Package
	InputValues textinput = new InputValues("ForgotPassword.properties");
	String TestcaseName = getClass().getSimpleName().toString();
	
	//Parameter annotation is to  pass which Browser should test case should executed got from TestNG.xml file 
	@Parameters({ "Browser" })
	@BeforeMethod
	 public void beforeTest(String Browser) {
	  String URL	=	textinput.inputValueof("UrlHome");
	  driver = BrowserFactory.startBrowser(Browser,URL);
	 }
	
	@Test
	  public void ForgotPassword_check() {
		LoginPage login = new LoginPage(driver,TestcaseName);
		login.click_siginButton();
		login.select_LoginFrame();
	
		String Email_id 		= textinput.inputValueof("Emaild_valid");
		String Expected_Title	= textinput.inputValueof("Expected_successMsg");	
	
	//ForgotPassword_page class contains all the actions declared in it
		ForgotPassword_page getNewPassword = new ForgotPassword_page(driver,TestcaseName);
		getNewPassword.clickForgotPasswordLink();
		
		WindowsHelper windows = new WindowsHelper(driver,TestcaseName);
		windows.SelectActiveFrame();
		
		getNewPassword.enter_emailidForgotPasswordLink(Email_id);
		getNewPassword.click_SubmitButton();
		
		String Expected_HelloMessage = Expected_Title;
		String Actual_HelloMessage = getNewPassword.get_Successtext();
		AssertJUnit.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	 }
	

	
	@AfterMethod
	public void afterTest() throws IOException{
		String screenhotname 		= textinput.inputValueof("ScreenshotName");
		WindowsHelper page = new WindowsHelper(driver, TestcaseName);
		page.takeScreenShot(screenhotname);
		page.closewindow();
		
		
	}
}
