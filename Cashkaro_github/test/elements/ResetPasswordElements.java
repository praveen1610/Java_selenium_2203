package elements;

import org.openqa.selenium.By;

public class ResetPasswordElements {

    public static By resetEmailAddress()
    {
        return By.id("from_email");
    }

    public static By submitButton()
    {
        return By.id("submit_req");
    }

    public static By passwordSentMessage()
    {
        return By.cssSelector("div.f_pass_s h2");
    }
}
