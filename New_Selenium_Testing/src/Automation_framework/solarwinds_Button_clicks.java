package Automation_framework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class solarwinds_Button_clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://solarwinds.com");
		driver.findElement(By.linkText("RESOLVE NOW")).click();
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
		//driver.findElement(By.xpath("//@[contains(@href, '/virtualization-manager.aspx')])[5]")).click();
				//xpath("//@[contains(@href, '/virtualization-manager.aspx')])[5]")).click();
		//xpath=(//a[contains(@href, '/virtualization-manager.aspx')])[5]
		driver.quit();
	}

}
