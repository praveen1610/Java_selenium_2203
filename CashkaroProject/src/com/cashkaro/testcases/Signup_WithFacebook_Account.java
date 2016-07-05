package com.cashkaro.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.cashkaro.pages.LoginPage;
import com.cashkaro.pages.SignUpPage;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Helper.BrowserFactory;
import Helper.WindowsHelper;
import Helper.InputValues;

public class Signup_WithFacebook_Account {
private WebDriver driver;
String TestcaseName = getClass().getSimpleName().toString();

//Input data for test case are got from properties file in resource folder
//Properties file is processed through InputValues Class in Helper Package
InputValues textinput = new InputValues("Signup_WithFacebook_Account.properties");

 @Test
  public void facebook_joinfree() {

	 String TestcaseName = getClass().getName().toString();
	 String FBLoing_ID	=	textinput.inputValueof("FBLoginID");
	 String FB_Password	=	textinput.inputValueof("FBPassword");
	 String Expected_HelloMessage = textinput.inputValueof("FBusername");
	 
	 SignUpPage signup = new SignUpPage(driver,TestcaseName);
	 signup.click_JoinNowButton();
	 signup.clickJoinWithFBButton();
	 signup.type_loginFacebookcred(FBLoing_ID,FB_Password);
	 signup.clickOnLoginButton();
	 
	 WindowsHelper page = new WindowsHelper(driver,TestcaseName);
	 String title = page.getPageTile();
	   
	   if (title.equals("Log in with Facebook"))
		{
		 	signup.click_FBokayButton();
		}
	 	LoginPage loginsuccess = new LoginPage(driver,TestcaseName);
	 	
		String Actual_HelloMessage = loginsuccess.verify_LoginSuccess();
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