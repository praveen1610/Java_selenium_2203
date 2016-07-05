package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.Locator_repositoryReader;

public class ForgotPasswordPageNew {


	WebDriver driver;
	String TestCaseName;
	Logger log = Logger.getLogger("ForgotPassword_page");
	//All the locations like xpath, id are present in XML file in folder LocationRepository
	//Locator_repositoryReader Helper class proccess this XML and give the location as string
	static final Locator_repositoryReader Locators = new Locator_repositoryReader("ForgotPassword_page.xml");
	
	public static final String v1 = Locators.getlocation("ForgotPassword_popuplink").toString();
	
	//public static final String v1 = "from_email";
	
	@FindBy(id="from_email") @CacheLookup WebElement EmailID_TextBox;
	//@FindBy(id=v1) @CacheLookup WebElement EmailID_TextBox_1;
	@FindBy(how = How.ID,using="submit_req")@CacheLookup WebElement SubmitButton;
	@FindBy(how=How.CSS,using = ".f_pass_s>h2")@CacheLookup WebElement SentText;
	
	public ForgotPasswordPageNew(WebDriver driver, String TestCaseName){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.TestCaseName = TestCaseName;		
	}
	
	
	public void clickForgotPasswordLink(){
		//driver.findElement(ForgotPassword_popuplink).click();
		EmailID_TextBox.click();
		log.info(TestCaseName+ " Forgot Password pop up link is clicked");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	public void enter_emailidForgotPasswordLink(String Emailid){
		EmailID_TextBox.sendKeys(Emailid);
		log.info(TestCaseName+ " Email id given in Forgot Email id input box");
		
	}
	
	public void click_SubmitButton(){
		SubmitButton.click();
		log.info(TestCaseName+ " Login Frame Submit Button");
		
	}
	
	public String get_Successtext(){
		String senttitle = SentText.getText();
		log.info(TestCaseName+ " Sent title verification text present");
		return senttitle;
		
		}
	}
