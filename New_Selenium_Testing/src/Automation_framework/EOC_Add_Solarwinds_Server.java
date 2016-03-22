package Automation_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class EOC_Add_Solarwinds_Server {
  private WebDriver driver;
  private String baseURL;
  
@Test
public void addOrionServer() {
	  driver.get(baseURL);
	  //driver.findElement(By.className("sw-btn-t")).click();
	  System.out.println("The page title is "+driver.getTitle());
	  
	 //Select setting = new Select(driver.findElement(By.id("mega-menu-settings")));
	 //setting.selectByVisibleText("Add SolarWinds Site"); 	  
  }


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/praveenkumar.jaya/Downloads/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  baseURL = "http://www.dnsstuff.com/tools";
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.findElement(By.cssSelector("a.ui-helper-clearfix > span.icon")).click();
	  //driver.findElement(By.className("admin")).click();
	  //driver.quit();
  }

}
