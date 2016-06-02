package com.cashkaro.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.sign_up_page;
import Helper.BrowserFactory;
import Helper.InputValues;

public class Login_WithFacebook_Account {
	private WebDriver driver;
	InputValues textinput = new InputValues("Login_WithFacebook_Account.properties");

	 @Test
	  public void facebook_joinfree() {
		 String FB_Login		=	textinput.InputValueof("FBLoginID");
		 String FB_Password 	=	textinput.InputValueof("FBPassword");
		 String Expected_HelloMessage = textinput.InputValueof("FBusername");
		 
		Login_Page login = new Login_Page(driver);
			login.Click_siginButton();
			login.Select_LoginFrame();
		
		sign_up_page signup = new sign_up_page(driver);
			 signup.ClickJoinWithFBButton();
			 signup.Type_loginFacebookcred(FB_Login,FB_Password);
			 
			 String Actual_HelloMessage = login.Verify_LoginSuccess();
			 Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	 }
	 
	 @Parameters({ "Browser" })
		@BeforeMethod
		 public void beforeTest(String Browser) {
			String URL	=	textinput.InputValueof("UrlHome");
		  driver = BrowserFactory.startBrowser(Browser,URL);
		 }
	
}
