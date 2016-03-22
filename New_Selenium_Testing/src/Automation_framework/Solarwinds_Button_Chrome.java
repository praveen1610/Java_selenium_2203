package Automation_framework;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solarwinds_Button_Chrome {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver", "C:/selenium-2.50.0/selenium-2.50.0/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://solarwinds.com");
			//driver.findElement(By.linkText("RESOLVE NOW")).click();
			WebElement element = driver.findElement(By.linkText("RESOLVE NOW"));
			element.click();
			String NPMURL = driver.getCurrentUrl();
			System.out.println("The NPM url is " +NPMURL);
			
			driver.navigate().back();
			driver.findElement(By.linkText("FIND THE CAUSE")).click();
			String NPMURL1 = driver.getCurrentUrl();
			System.out.println("The second NPM url is " +NPMURL1);
			
			driver.navigate().back();
			driver.findElement(By.linkText("TROUBLESHOOT")).click();
			String SAMlink = driver.getCurrentUrl();
			System.out.println("The SAM URL is "+ SAMlink);
			
			driver.navigate().back();
			driver.findElement(By.linkText("Next")).click();
			driver.findElement(By.linkText("FIND OUT WHY")).click();
			String DBlink = driver.getCurrentUrl();
			System.out.println("DBlink is "+ DBlink);
			
			driver.navigate().back();
			driver.quit();
		}

	}


