package frames;

import common.WebDriverProvider;
import entities.EmailAddress;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static common.WebDriverFunctions.WaitForElementPresent;
import static elements.ResetPasswordElements.*;

public class ResetPasswordFrame {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public ResetPasswordFrame giveUserName(EmailAddress resetPassword) {
        WaitForElementPresent(driver, resetEmailAddress());
        driver.findElement(resetEmailAddress()).sendKeys(resetPassword.emailAddress);
        return this;
    }

    public ResetPasswordFrame submitResetPassword() {
        driver.findElement(submitButton()).click();
        return this;
    }

    public ResetPasswordFrame checkIfMessageForResetAppears() {
        WaitForElementPresent(driver, passwordSentMessage());
        Assert.assertEquals(driver.findElement(passwordSentMessage()).getText(), "Password sent!");
        return this;
    }
}
