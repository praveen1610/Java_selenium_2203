package Sample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Switch_windows {
  @Test
  public void frameSelect() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.dnsstuff.com/tools");
	  driver.findElement(By.xpath("//div[@id='tab-6']")).click();
	  driver.findElement(By.xpath("//a[@class='view_link']")).click();

	  //Switch windows
	  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(tabs2.get(1));
	  System.out.println(driver.getTitle().toString());
	  
  }
}
