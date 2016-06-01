package com.cashkaro.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.sign_up_page;
import Helper.BrowserFactory;
import Helper.InputValues;

public class Login_WithFacebook_Account {
	private WebDriver driver;
	InputValues textinput = new InputValues();

	 @Test
	  public void facebook_joinfree() {
		 Login_Page login = new Login_Page(driver);
			login.Click_siginButton();
			login.Select_LoginFrame();
		
		sign_up_page signup = new sign_up_page(driver);
			 signup.ClickJoinWithFBButton();
			 signup.Type_loginFacebookcred(textinput.InputValueof("FBLoginID"), textinput.InputValueof("FBPassword"));
			 signup.ClickOnLoginButton();
			 signup.Click_FBokayButton();
	 	Login_Page loginsuccess = new Login_Page(driver);
		 	String Expected_HelloMessage = "Hello " +(textinput.InputValueof("FBusername"))+ "," ;
			String Actual_HelloMessage = loginsuccess.Verify_LoginSuccess();
			Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	 }
	 
		@BeforeMethod
		public void beforeTest() {
		 driver = BrowserFactory.startBrowser("firefox",textinput.InputValueof("UrlHome"));
		}
	
}
