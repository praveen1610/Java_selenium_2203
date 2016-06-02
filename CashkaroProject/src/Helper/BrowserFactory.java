package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String URL){
		
		if(browserName.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "c:/input/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("IE")){
		driver = new InternetExplorerDriver();
	}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
}
}
