package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String URL){
		
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.bin", "c:/input/chromedriver.exe");
			driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "c:/input/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", "c:/input/IEDriverServer.exe");
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
			    true);
		driver = new InternetExplorerDriver(ieCapabilities);
	}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
}
