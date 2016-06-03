package Helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WindowsHelper {
	
	private WebDriver driver;

	public WindowsHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public String getPageTile(){
		String pageTile = driver.getTitle().toString();
		return pageTile;
	}
	
	public void closewindow(){
		driver.quit();
	}

	public void takeScreenShot(String screenshot) throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\output\\"+screenshot+".png"));
	}
}
