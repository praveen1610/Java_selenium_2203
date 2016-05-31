package Sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

public class DNSLooup_dropdown {
  //Select from drop down, fluent wait
	
	@Test
  public void LoopupRecord() {
	  WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dnsstuff.com/tools");
		driver.manage().window().maximize();  
		Select lookup_dropdown = new Select(driver.findElement(By.id("ispCacheLookup__recordType")));
		lookup_dropdown.selectByIndex(1);
		driver.findElement(By.id("ispCacheLookup")).sendKeys("solarwinds.com");
		driver.findElement(By.xpath("//form[@id='ispCacheLookupForm']/button")).click();
		
		FluentWait<WebDriver> waits = new FluentWait<WebDriver>(driver).withTimeout(180,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement returnback = (WebElement) waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='executionSummary']/div[@id='back']")));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
	
			
		String Title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println("Current url " +URL+" Current Title " +Title);
		returnback.click();   
		driver.close();
	}
  }
