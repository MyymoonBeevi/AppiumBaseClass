package Test;

import Page.LoginPage;
import Utils.Hooks;
import org.testng.annotations.Test;

public class Login extends Hooks {
    @Test
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Test
    public void unsuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("invalid_username");
        loginPage.enterPassword("invalid_password");
        loginPage.clickLoginButton();
    }
}
