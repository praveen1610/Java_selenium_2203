package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DNS_whois {
	//Explicit wait
	
	@Test
	public void whoistool(){
		WebDriver driver = new FirefoxDriver();
		/*
		interface
		reference variable or object
		class
		*/
		
		driver.get("http://www.dnsstuff.com/tools");
		driver.manage().window().maximize();  
		driver.findElement(By.xpath("//input[@id='whois']")).sendKeys("brothersoft.com");
		driver.findElement(By.xpath("//input[@id='whois__optionalServer']")).sendKeys("95.100.173.66");
		driver.findElement(By.cssSelector("#whoisForm > button.tool_form_btn")).click();
		
		  //Explicit wait: Waits until the particular condition for 10 seconds
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  WebElement returnback = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='executionSummary']/div[@id='back']")));
		  
		  
		  String Title = driver.getTitle();
		  String URL = driver.getCurrentUrl();
		  System.out.println("Current url " +URL+" Current Title " +Title);
		  returnback.click();	   
		  driver.close();
	}

}
