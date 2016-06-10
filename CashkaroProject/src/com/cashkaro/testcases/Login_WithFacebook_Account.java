package com.cashkaro.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.cashkaro.pages.Login_Page;
import com.cashkaro.pages.Sign_up_page;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

public class Login_WithFacebook_Account {
	private WebDriver driver;
	
	//Input data for test case are got from properties file in resource folder
	//Properties file is processed through InputValues Class in Helper Package
	InputValues textinput = new InputValues("Login_WithFacebook_Account.properties");

	 @Test
	  public void facebook_joinfree() {
		 String FB_Login		=	textinput.inputValueof("FBLoginID");
		 String FB_Password 	=	textinput.inputValueof("FBPassword");
		 String Expected_HelloMessage = textinput.inputValueof("FBusername");
		 
		Login_Page login = new Login_Page(driver);
			login.click_siginButton();
			login.select_LoginFrame();
		
		Sign_up_page signup = new Sign_up_page(driver);
			 signup.clickJoinWithFBButton();
			 signup.type_loginFacebookcred(FB_Login,FB_Password);
			 signup.click_FBokayButton();
			 
			 String Actual_HelloMessage = login.verify_LoginSuccess();
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
