package page;

import common.WebDriverProvider;
import frames.SignInFrame;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static common.WebDriverFunctions.WaitForElementPresent;
import static elements.HomePageElements.*;

public class HomePage {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public SignInFrame clickOnSignIn() {
        driver.findElement(signInButton()).click();
        return new SignInFrame();
    }

    public void checkIfUserIsInLoggedInHomePage() {
        WaitForElementPresent(driver, myAccountButton());
        Assert.assertEquals(driver.findElement(myAccountButton()).getText(),"MY ACCOUNT");
    }
}
