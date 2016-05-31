package com.cashkaro.testcases;

import org.testng.annotations.Test;
import com.cashkaro.pages.sign_up_page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import Helper.BrowserFactory;

public class Free_login_facebook {
private WebDriver driver;
 @Test
  public void facebook_joinfree() {
	 sign_up_page signup = new sign_up_page(driver);
	 signup.ClickJoinWithFBButton();
	 signup.Type_loginFacebookcred("testing@test16.co.uk", "password");
	 signup.ClickOnLoginButton();
 }
 
 @BeforeMethod
 public void beforeTest() {
 driver = BrowserFactory.startBrowser("firefox", "http://cashkaro.iamsavings.co.uk/join-free-now");
 }
 
}