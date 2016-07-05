package frames;

import common.WebDriverProvider;
import entities.Credential;
import org.openqa.selenium.WebDriver;
import page.HomePage;

import static common.WebDriverFunctions.WaitForElementPresent;
import static elements.SignInElements.*;

public class SignInFrame {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public SignInFrame giveValidCredentials(Credential values) {
        switchToSignInFrame();
        giveValuesForSignInInputField(values);
        return this;
    }

    private void switchToSignInFrame(){
        WaitForElementPresent(driver, signInIFrame());
        driver.switchTo().frame(driver.findElement(signInIFrame()));
    }

    private void giveValuesForSignInInputField(Credential values)
    {
        driver.findElement(userName()).sendKeys(values.username);
        driver.findElement(password()).sendKeys(values.password);
    }

    public HomePage submitSignin() {
        driver.findElement(signInButton()).click();
        return new HomePage();
    }

    public ResetPasswordFrame clickOnResetPassword() {
        switchToSignInFrame();
        driver.findElement(forgetPassword()).click();
        return new ResetPasswordFrame();
    }
}
