package com.cashkaro.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.cashkaro.pages.ForgotPassword_page;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

public class ForgotPassword {
	private WebDriver driver;
	
	InputValues textinput = new InputValues("ForgotPassword.properties");
	
	@Test
	  public void ForgotPassword_check() {
		Login_Page login = new Login_Page(driver);
		login.Click_siginButton();
		login.Select_LoginFrame();
		
		String Email_id 		= textinput.InputValueof("Emaild_valid");
		String Expected_Title	= textinput.InputValueof("Expected_successMsg");	
		
		ForgotPassword_page getNewPassword = new ForgotPassword_page(driver);
		getNewPassword.clickForgotPasswordLink();
		getNewPassword.Select_ActiveFrame();
		getNewPassword.enter_emailidForgotPasswordLink(Email_id);
		getNewPassword.click_SubmitButton();
		
		String Expected_HelloMessage = Expected_Title;
		String Actual_HelloMessage = getNewPassword.get_Successtext();
		Assert.assertEquals(Actual_HelloMessage, Expected_HelloMessage);
	 }
	 
	@Parameters({ "Browser" })
	@BeforeMethod
	 public void beforeTest(String Browser) {
	  String URL	=	textinput.InputValueof("UrlHome");
	  driver = BrowserFactory.startBrowser("firefox",URL);
	 }
	
	@AfterMethod
	public void afterTest() throws IOException{
		String screenhotname 		= textinput.InputValueof("ScreenshotName");
		WindowsHelper page = new WindowsHelper(driver);
		page.takeScreenShot(screenhotname);
		page.closewindow();
		
		
	}
}
