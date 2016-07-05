package com.cashkaro.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.cashkaro.pages.LoginPage;
import com.cashkaro.pages.SignUpPage;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

public class Login_WithFacebook_Account {
	private WebDriver driver;
	String TestcaseName = getClass().getSimpleName().toString();
	
	//Input data for test case are got from properties file in resource folder
	//Properties file is processed through InputValues Class in Helper Package
	InputValues textinput = new InputValues("Login_WithFacebook_Account.properties");

	 @Test
	  public void facebook_joinfree() {
		 String FB_Login		=	textinput.inputValueof("FBLoginID");
		 String FB_Password 	=	textinput.inputValueof("FBPassword");
		 String Expected_HelloMessage = textinput.inputValueof("FBusername");
		 
		LoginPage login = new LoginPage(driver,TestcaseName);
			login.click_siginButton();
			login.select_LoginFrame();
		
		WindowsHelper windows = new WindowsHelper(driver,TestcaseName);
		windows.SelectActiveFrame();
		
		SignUpPage signup = new SignUpPage(driver,TestcaseName);
			 signup.clickJoinWithFBButton();
			 signup.type_loginFacebookcred(FB_Login,FB_Password);
			 signup.clickOnLoginButton();
			 if (windows.equals("Log in with Facebook"))
				{
				 	signup.click_FBokayButton();
				}
			 
			 String Actual_HelloMessage = login.verify_LoginSuccess();
			 AssertJUnit.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
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
