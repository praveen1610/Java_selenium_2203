package Sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {
  @Test
  public void Tooltiptest() throws IOException {
	  WebDriver driver = new FirefoxDriver();

	  driver.get("http://www.dnsstuff.com/tools");
	  
	  Actions tooltipaction = new Actions(driver);
	  WebElement dnsreport = driver.findElement(By.xpath("//div[@id='tool_dnsReport']/div/h2"));
	  tooltipaction.clickAndHold(dnsreport).perform();
	  String DNSreportToolTipText = driver.findElement(By.xpath("//div[@id='tooltip']/h3")).getText();
	  System.out.println("DNSreport Tootip is  " +DNSreportToolTipText);
	  tooltipaction.release(dnsreport).perform();
	  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot, new File("c:\\screenshot.png"));
	  WebElement Whois = driver.findElement(By.xpath("//div[@id='tool_whois']/div/h2"));
	  tooltipaction.clickAndHold(Whois).perform();
	  String whoisToolTipText = driver.findElement(By.xpath("//div[@id='tooltip']/h3")).getText();
	  System.out.println("Whois tooltip is "+whoisToolTipText);
	  tooltipaction.release(Whois).perform();
	  
	  driver.get("http://www.dnsstuff.com/");
	  WebElement DNSreport_home = driver.findElement(By.xpath("//button[@type='submit']"));
	  tooltipaction.clickAndHold(DNSreport_home).perform();
	  String IPdnsreport = DNSreport_home.getAttribute("title");
	  System.out.println(IPdnsreport);
	  
	  
  }
}
