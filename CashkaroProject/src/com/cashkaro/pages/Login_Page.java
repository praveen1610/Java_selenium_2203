package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Helper.Object_repositoryReader;


public class Login_Page {
	WebDriver driver;
	Object_repositoryReader Locators = new Object_repositoryReader("Login_page.xml");
	

	By signin_popup 		 = By.cssSelector(Locators.getlocation("signin_popup"));
	By Login_popupframe	 	 = By.xpath(Locators.getlocation("Login_popupframe"));
	By Login_username 		 = By.xpath(Locators.getlocation("Login_username"));
	By Login_password		 = By.id(Locators.getlocation("Login_password"));
	By Login_submitbutton	 = By.xpath(Locators.getlocation("Login_submitbutton"));  
	By MyAccount_button      = By.xpath(Locators.getlocation("MyAccount_button"));
	By Login_successname	 = By.cssSelector(Locators.getlocation("Login_successname"));
	By Errormessage			 = By.id(Locators.getlocation("Errormessage"));
	
	public Login_Page(WebDriver driver){
		this.driver = driver;
	}
	

	public void click_siginButton(){
		driver.findElement(signin_popup).click(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void select_LoginFrame(){
	WebElement login_frame = driver.findElement(Login_popupframe);
	driver.switchTo().frame(login_frame);
	}
	
	public void Enter_cashkarocred(String UserEmail, String password){
	driver.findElement(Login_username).sendKeys(UserEmail);
	driver.findElement(Login_password).sendKeys(password);
	}
	
	public void click_LoginSubmitButton(){
		driver.findElement(Login_submitbutton).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String verify_LoginSuccess(){
		driver.findElement(MyAccount_button).isDisplayed();
		String Logged_Username = driver.findElement(Login_successname).getText();
		return Logged_Username;
	}

	public String verify_ErrorMessage(){
		String Errormessage_displayed = driver.findElement(Errormessage).getText();
		return Errormessage_displayed;
		
	}
	

}
