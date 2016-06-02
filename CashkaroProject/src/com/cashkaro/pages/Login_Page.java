package com.cashkaro.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login_Page {
	WebDriver driver;
	
	By signin_popup 		 = By.cssSelector(".fl.signin_popupbox");
	By Login_popupframe	 	 = By.xpath("//div[@id='cboxLoadedContent']/iframe");
	By Login_username 		 = By.xpath("//input[@id='uname']");
	By Login_password		 = By.id("pwd-txt");
	By Login_submitbutton	 = By.xpath("//input[@id='sign_in']");  
	By MyAccount_button      = By.xpath("//a[contains(text(),'MY ACCOUNT')]");
	By Login_successname	 = By.cssSelector(".fr.home_login>p");
	By Errormessage			 = By.id("login_msg");

	
	
	
	public Login_Page(WebDriver driver){
		this.driver = driver;
	}
	

	public void Click_siginButton(){
		driver.findElement(signin_popup).click(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void Select_LoginFrame(){
	WebElement login_frame = driver.findElement(Login_popupframe);
	driver.switchTo().frame(login_frame);
	}
	
	public void Enter_cashkarocred(String UserEmail, String password){
	driver.findElement(Login_username).sendKeys(UserEmail);
	driver.findElement(Login_password).sendKeys(password);
	}
	
	public void Click_LoginSubmitButton(){
		driver.findElement(Login_submitbutton).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String Verify_LoginSuccess(){
		driver.findElement(MyAccount_button).isDisplayed();
		String Logged_Username = driver.findElement(Login_successname).getText();
		return Logged_Username;
	}

	public String Verify_ErrorMessage(){
		String Errormessage_displayed = driver.findElement(Errormessage).getText();
		return Errormessage_displayed;
		
	}
	

}
