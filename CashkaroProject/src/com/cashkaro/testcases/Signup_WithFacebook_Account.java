package com.cashkaro.testcases;

import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.Sign_up_page;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import Helper.BrowserFactory;
import Helper.WindowsHelper;
import Helper.InputValues;

public class Signup_WithFacebook_Account {
private WebDriver driver;

//Input data for test case are got from properties file in resource folder
//Properties file is processed through InputValues Class in Helper Package
InputValues textinput = new InputValues("Signup_WithFacebook_Account.properties");

 @Test
  public void facebook_joinfree() {
	 String FBLoing_ID	=	textinput.inputValueof("FBLoginID");
	 String FB_Password	=	textinput.inputValueof("FBPassword");
	 String Expected_HelloMessage = textinput.inputValueof("FBusername");
	 
	 Sign_up_page signup = new Sign_up_page(driver);
	 signup.click_JoinNowButton();
	 signup.clickJoinWithFBButton();
	 signup.type_loginFacebookcred(FBLoing_ID,FB_Password);
	 signup.clickOnLoginButton();
	 
	 WindowsHelper page = new WindowsHelper(driver);
	 String title = page.getPageTile();
	   if (title.equals("Log in with Facebook"))
		{
		 	signup.click_FBokayButton();
		}
	 	Login_Page loginsuccess = new Login_Page(driver);
	 	
		String Actual_HelloMessage = loginsuccess.verify_LoginSuccess();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
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
		WindowsHelper page = new WindowsHelper(driver);
		page.takeScreenShot(screenhotname);
		page.closewindow();
		
		
	}
 
}