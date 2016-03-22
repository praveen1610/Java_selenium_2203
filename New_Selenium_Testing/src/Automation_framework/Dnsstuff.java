//Dnsstuuf login with Firefox Browser
package Automation_framework;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Dnsstuff {
@Test
	public void signup() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dnsstuff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("osynyt");
		driver.findElement(By.className("sign_up_password")).clear();
		driver.findElement(By.className("sign_up_password")).sendKeys("DnssTu44");
		driver.findElement(By.name("Submit")).click();
		//Thread.sleep(50);
		
		driver.findElement(By.id("tab-3")).click();
		driver.quit();
		

	}

}
