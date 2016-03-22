package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DNSreport {
//Implicit Wait, Click, Sendkeys
	
private WebDriver driver;
@BeforeMethod
	public void toolspage(){
		 //WebDriver driver = new FirefoxDriver();
		  driver = new FirefoxDriver();
		  driver.get("http://www.dnsstuff.com/tools");
		  driver.manage().window().maximize();  
	}

@Test
  	public void Dnsreport() throws InterruptedException {
	 //WebDriver driver = new FirefoxDriver();
		
	  driver.findElement(By.xpath("//input[@id='dnsReport']")).sendKeys("gmail.com");
	  driver.findElement(By.xpath("//form[@id='dnsReportForm']/button")).click();

	  //Implicit wait: it will tell selenium, wait for a certain amount of time before throwing an exception
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	  
	  WebElement returnback = driver.findElement(By.xpath("//div[@id='executionSummary']/div[@id='back']"));
	  returnback.isEnabled();
	  String Title = driver.getTitle();
	  String URL = driver.getCurrentUrl();
	  System.out.println("Current url " +URL+" Current Title " +Title);
	  returnback.click();	   
	  driver.close();
	  	  
  }
}