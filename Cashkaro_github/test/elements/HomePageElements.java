package elements;

import org.openqa.selenium.By;

public class HomePageElements {

    public static By signInButton()
    {
        return By.cssSelector("a.fl.signin_popupbox");
    }

    public static By myAccountButton()
    {
        return By.cssSelector("li.fl.pos.my_drop a");
    }
}
