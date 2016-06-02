package com.cashkaro.testcases;

import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.sign_up_page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Helper.BrowserFactory;
import Helper.GetPagetitle;
import Helper.InputValues;

public class Signup_WithFacebook_Account {
private WebDriver driver;
InputValues textinput = new InputValues("Signup_WithFacebook_Account.properties");

 @Test
  public void facebook_joinfree() {
	 String FBLoing_ID	=	textinput.InputValueof("FBLoginID");
	 String FB_Password	=	textinput.InputValueof("FBPassword");
	 String Expected_HelloMessage = textinput.InputValueof("FBusername");
	 
	 sign_up_page signup = new sign_up_page(driver);
	 signup.click_JoinNowButton();
	 signup.ClickJoinWithFBButton();
	 signup.Type_loginFacebookcred(FBLoing_ID,FB_Password);
	 signup.ClickOnLoginButton();
	 
	 GetPagetitle page = new GetPagetitle(driver);
	 String title = page.getPageTile();
	 if (title.equals("Log in with Facebook"))
		{
		 		signup.Click_FBokayButton();
		 }
	 	Login_Page loginsuccess = new Login_Page(driver);
	 	
		String Actual_HelloMessage = loginsuccess.Verify_LoginSuccess();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
 }
 
 @Parameters({ "Browser" })
	@BeforeMethod
	 public void beforeTest(String Browser) {
		String URL	=	textinput.InputValueof("UrlHome");
	  driver = BrowserFactory.startBrowser(Browser,URL);
	 }
 
}