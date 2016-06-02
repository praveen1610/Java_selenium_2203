package com.cashkaro.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cashkaro.pages.Login_Page;
import Helper.BrowserFactory;
import Helper.InputValues;
import org.testng.Assert;

public class Login_invalidPassword {

		    private WebDriver driver;
			InputValues textinput = new InputValues("Login_invalidPassword.properties");
			
			@Test
			private void checkValidUser(){
				String Expected_ErrorMessage = textinput.InputValueof("Errormsg_invalidpassword");
				String Email_id = textinput.InputValueof("Valid_EmailID");
				String invalidPassword = textinput.InputValueof("Invalid_Password");
				
				Login_Page login = new Login_Page(driver);
				login.Click_siginButton();
				login.Select_LoginFrame();
				login.Enter_cashkarocred(Email_id,invalidPassword );
				login.Click_LoginSubmitButton();
				String Actual_ErrorMessage = login.Verify_ErrorMessage();
				Assert.assertEquals(Actual_ErrorMessage, Expected_ErrorMessage);
			}
			
			@Parameters({ "Browser" })
			@BeforeMethod
			 public void beforeTest(String Browser) {
				String URL	=	textinput.InputValueof("UrlHome");
			  driver = BrowserFactory.startBrowser(Browser,URL);
			 }
			 
}
