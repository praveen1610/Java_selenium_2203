package tests;

import factory.EmailAddressFactory;
import factory.CredentialsFactory;
import org.junit.Test;
import page.HomePage;

public class SigninTest extends BaseTest {

    @Test
    public void verifySigninWithValidInputs()
    {
        new HomePage()
                .clickOnSignIn()
                .giveValidCredentials(CredentialsFactory.getValidCredentials())
                .submitSignin()
                .checkIfUserIsInLoggedInHomePage();
    }

    @Test
    public void verifyresetPassword()
    {
        new HomePage()
                .clickOnSignIn()
                .clickOnResetPassword()
                .giveUserName(EmailAddressFactory.getValidEmailAddress())
                .submitResetPassword()
                .checkIfMessageForResetAppears();
    }
}
