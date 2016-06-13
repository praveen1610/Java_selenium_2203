package com.cashkaro.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cashkaro.pages.LoginPage;
import Helper.BrowserFactory;
import Helper.InputValues;
import Helper.WindowsHelper;

import org.testng.Assert;

public class Login_invalidPassword {

			String TestcaseName = getClass().getSimpleName().toString();
		    private WebDriver driver;
		    
			//Input data for test case are got from properties file in resource folder
			//Properties file is processed through InputValues Class in Helper Package
			InputValues textinput = new InputValues("Login_invalidPassword.properties");
			
			@Test
			private void checkValidUser(){
				String Expected_ErrorMessage = textinput.inputValueof("Errormsg_invalidpassword");
				String Email_id = textinput.inputValueof("Valid_EmailID");
				String invalidPassword = textinput.inputValueof("Invalid_Password");
				LoginPage login = new LoginPage(driver,TestcaseName);
				login.click_siginButton();
				login.select_LoginFrame();
				login.Enter_cashkarocred(Email_id,invalidPassword );
				login.click_LoginSubmitButton();
				String Actual_ErrorMessage = login.verify_ErrorMessage();
				AssertJUnit.assertEquals(Actual_ErrorMessage, Expected_ErrorMessage);
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
