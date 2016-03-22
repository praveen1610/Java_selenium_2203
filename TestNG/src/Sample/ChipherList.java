package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChipherList {

  //List, Select and Checkbox testing
  @Test
  public void ListofChipher() {
	  	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dnsstuff.com/tools");
		driver.manage().window().maximize();  
		Select chipher = new Select(driver.findElement(By.id("sslExamination__optionalCipher")));
		for(int i=0 ;i<chipher.getOptions().size(); i++){			System.out.println(chipher.getOptions().get(i).getAttribute("value"));}
		
		List<WebElement> allElements = driver.findElements(By.xpath("//Select[@id='sslExamination__optionalCipher']"));
		for(WebElement element: allElements){
			System.out.println(element.getText());
		}
			
			if(driver.findElement(By.xpath("//input[@id='imapStat__imapStatSsl']")).isSelected()){
				driver.findElement(By.xpath("//input[@id='imapStat__imapStatSsl']")).click();
			}
			else
			{
				System.out.println("SSL not selected");
			}
		
  }
}
