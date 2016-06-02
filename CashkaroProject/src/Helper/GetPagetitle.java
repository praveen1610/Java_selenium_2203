package Helper;

import org.openqa.selenium.WebDriver;

public class GetPagetitle {
	
	private WebDriver driver;

	public GetPagetitle(WebDriver driver){
		this.driver = driver;
	}
	
	public String getPageTile(){
		String pageTile = driver.getTitle().toString();
		return pageTile;
	}

}
