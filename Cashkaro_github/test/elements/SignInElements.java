package elements;

import org.openqa.selenium.By;

public class SignInElements {

    public static By signInIFrame()
    {
        return By.cssSelector("iframe.cboxIframe");
    }

    public static By userName()
    {
        return By.id("uname");
    }

    public static By password()
    {
        return By.id("pwd-txt");
    }

    public static By forgetPassword()
    {
        return By.cssSelector("form#signin_form a.fl.link");
    }

    public static By signInButton()
    {
        return By.id("sign_in");
    }
}
