package tests;

import common.WebDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @Before
    public void setUp()
    {
        WebDriver driver = WebDriverProvider.getWebDriver();
        driver.get("http://cashkaro.iamsavings.co.uk/");
    }

    @After
    public void TearDown()
    {
        WebDriverProvider.quit();
    }
}
