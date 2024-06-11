package Test;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sample {

    public static void main(String[] args) {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "OPPO A15");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

        // Initialize the Appium driver
        AppiumDriver driver = null;
        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(url, caps);

            driver.findElement(By.xpath("")).sendKeys("");
            //Login

            driver.findElement(By.id("user-name")).sendKeys("standard_user");

            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

// Filter

           driver.findElement(By.xpath("//div[@id='inventory_filter_container']/select")).click();

            WebElement option = driver.findElement(By.xpath("//*[@id='inventory_filter_container']/select/option[3]"));

            option.click();

// select an Item

            driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();

//Add to cart

            driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

            driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();

            driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

//Fill the details

            driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("shenba");

            driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("santhiya");

            driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("627007");

            driver.findElement(By.xpath("//input[@type='submit']")).click();

            driver.findElement(By.xpath("//a[text()='FINISH']")).click();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
