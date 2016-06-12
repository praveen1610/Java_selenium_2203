package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Helper.Locator_repositoryReader;


public class LoginPage {
	WebDriver driver;
	String TestCaseName;
	Logger log = Logger.getLogger("Login_Page");
	//All the locations like xpath, id are present in XML file in folder LocationRepository
	//Locator_repositoryReader Helper class proccess this XML and give the location as string
	Locator_repositoryReader Locators = new Locator_repositoryReader("Login_page.xml");
	

	By signin_popup 		 = By.cssSelector(Locators.getlocation("signin_popup"));
	By Login_popupframe	 	 = By.xpath(Locators.getlocation("Login_popupframe"));
	By Login_username 		 = By.xpath(Locators.getlocation("Login_username"));
	By Login_password		 = By.id(Locators.getlocation("Login_password"));
	By Login_submitbutton	 = By.xpath(Locators.getlocation("Login_submitbutton"));  
	By MyAccount_button      = By.xpath(Locators.getlocation("MyAccount_button"));
	By Login_successname	 = By.cssSelector(Locators.getlocation("Login_successname"));
	By Errormessage			 = By.id(Locators.getlocation("Errormessage"));
	
	public LoginPage(WebDriver driver,String TestCaseName){
		this.driver = driver;
		this.TestCaseName = TestCaseName;
	}
	

	public void click_siginButton(){
		try{
		driver.findElement(signin_popup).click(); 
		log.info(TestCaseName+ " Clicked on sigin Button in Home page");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}
	
	public void select_LoginFrame(){
		try{
			WebElement login_frame = driver.findElement(Login_popupframe);
			log.info(TestCaseName+ " Found the Login Frame");
			driver.switchTo().frame(login_frame);
			log.info(TestCaseName+ " select Login Frame");
		}
	catch (Exception e){
		log.error(TestCaseName+ " " +e);
	}
	}
	
	public void Enter_cashkarocred(String UserEmail, String password){
		try{
			driver.findElement(Login_username).sendKeys(UserEmail);
			log.info(TestCaseName+ " Cashkaro Login credential Entered");
			driver.findElement(Login_password).sendKeys(password);
			log.info(TestCaseName+ " Cashkaro Password credential Entered");
		}
	catch (Exception e){
		log.error(TestCaseName+ " " +e);
	}
	}
	
	public void click_LoginSubmitButton(){
		try{
			driver.findElement(Login_submitbutton).click();
			log.info(TestCaseName+ " Clicked Login submit button");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
	}
	
	public String verify_LoginSuccess(){
		try{
			driver.findElement(MyAccount_button).isDisplayed();
			log.info(TestCaseName+ " My Accound Button visible in Web Page");
			String Logged_Username = driver.findElement(Login_successname).getText();
			return Logged_Username;
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
		return "To get Logged Username failed";
	}

	public String verify_ErrorMessage(){
		try{
			String Errormessage_displayed = driver.findElement(Errormessage).getText();
			log.info(TestCaseName+ " Error message Dislayed in Login Frame");
			return Errormessage_displayed;
		}
		catch (Exception e){
			log.error(TestCaseName+ " " +e);
		}
		return "Failed to get Error message text";
		
	}
	

}
