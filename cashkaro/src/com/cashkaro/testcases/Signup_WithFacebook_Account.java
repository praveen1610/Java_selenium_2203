package com.cashkaro.testcases;

import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.sign_up_page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import Helper.BrowserFactory;
import Helper.InputValues;

public class Signup_WithFacebook_Account {
private WebDriver driver;
InputValues textinput = new InputValues();

 @Test
  public void facebook_joinfree() {
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
 driver = BrowserFactory.startBrowser("chrome", textinput.InputValueof("UrlJoinNow"));
 }
 
}