package Automation_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FSM_SupportedDevice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.solarwinds.com/documentation/fsm/docs/help/supported_devices.html");
	//("http://www.solarwinds.com/documentation/fsm/docs/help/supported_devices.html");
	}

}
