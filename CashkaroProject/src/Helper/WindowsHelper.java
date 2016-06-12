package Helper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WindowsHelper {
	
	private WebDriver driver;
	String TestCaseName;

	public WindowsHelper(WebDriver driver, String TestCaseName){
		this.driver = driver;
		this.TestCaseName = TestCaseName;
	}
	
	public String getPageTile(){
		String pageTile = driver.getTitle().toString();
		return pageTile;
	}
	
	public void SelectActiveFrame(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().activeElement();
	}
	
	public void closewindow(){
		driver.quit();
	}

	public void takeScreenShot(String screenshot) throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\output\\"+screenshot+".png"));
	}
}
