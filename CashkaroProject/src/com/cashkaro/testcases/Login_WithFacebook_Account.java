package com.cashkaro.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.sign_up_page;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

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
			 signup.Click_FBokayButton();
			 
			 String Actual_HelloMessage = login.Verify_LoginSuccess();
			 Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	 }
	 
	 @Parameters({ "Browser" })
	 @BeforeMethod
		 public void beforeTest(String Browser) {
			String URL	=	textinput.InputValueof("UrlHome");
		  driver = BrowserFactory.startBrowser(Browser,URL);
		 }
	 
	 	@AfterMethod
		public void afterTest() throws IOException{
			String screenhotname 		= textinput.InputValueof("ScreenshotName");
			WindowsHelper page = new WindowsHelper(driver);
			page.takeScreenShot(screenhotname);
			page.closewindow();
			
			
		}
	
}
