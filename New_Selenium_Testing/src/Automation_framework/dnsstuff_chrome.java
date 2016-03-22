//Dnsstuff login with chrome Browser
package Automation_framework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chrome.ChromeDriver;



public class dnsstuff_chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/praveenkumar.jaya/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dnsstuff.com/");
		Thread.sleep(30);
		driver.findElement(By.className("sign_up_username")).sendKeys("osynyt");
		driver.findElement(By.className("sign_up_password")).sendKeys("testing");
				WebElement element = driver.findElement(By.name("remember"));
		if(element.isSelected())
		{
			System.out.println("The remember me is already checked");
		}
		else
		{
			element.click();
		}
		driver.quit();
		
	}

}
