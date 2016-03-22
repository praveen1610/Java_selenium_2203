package Automation_framework;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Select se = new Select
		/*driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("praveen_world99@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("World@austin99");
		driver.findElement(By.id("u_0_l")).click();
		
		Select se = new Select(driver.findElement(By.id("day")) );
		
		se.selectByVisibleText("5");
		
		Actions Action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[1]/h1/a"));
		Action.clickAndHold(element).perform();
		String tooltip = element.getAttribute("title");
		System.out.println(tooltip);
		
	    WebElement wb = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[6]/span/span[1]/input"));
	    
	    if(wb.isSelected())
	    	
	    {
	    	System.out.println("already clicked");
	    	
	    	
	    	
	    	
	    }
	    
	    else
	    	
	    	
	    {
	    	
	    	wb.click();
	    }*/
		
		
		List <WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());
		
		
		
		
		

	}

}
