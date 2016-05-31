package com.cashkaro.testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Helper.BrowserFactory;

public class Login {
	@Test
	private void checkValidUser(){
		
	}
	@BeforeMethod
	 public void beforeTest() {
	  BrowserFactory.startBrowser("firefox","htpp");
	 }
	 

}
