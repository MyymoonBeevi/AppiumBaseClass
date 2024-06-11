package Page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators
    private By usernameField = By.xpath("//android.widget.EditText[@content-desc='test-Username']");
    private By passwordField = By.xpath("//android.widget.EditText[@content-desc='test-Password']");
    private By loginButton = By.xpath("//android.widget.TextView[@text='LOGIN']");

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    // Page specific methods
    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
