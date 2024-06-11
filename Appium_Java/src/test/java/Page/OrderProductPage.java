package Page;

import Test.OrderProduct;
import io.appium.java_client.AppiumDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;

public class OrderProductPage extends BasePage {
    public OrderProductPage(AppiumDriver driver) {
        super(driver);
    }

    public void addProductToCart() {
        click(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]"));
    }

    public void goToCart() {
        click(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.view.ViewGroup"));
    }
    public void checkoutProduct(String firstName,String lastName,String postalCode){
        //click Checkout button
        click(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
        //Enter CheckOut Information
        enterText(By.xpath("//android.widget.EditText[@content-desc='test-First Name']"),firstName);
        enterText(By.xpath("//android.widget.EditText[@content-desc='test-Last Name']"),lastName);
        enterText(By.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']"),postalCode);
        //Click Continue
        click(By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUE']"));
        //click Finish
        click(By.xpath("//android.widget.TextView[@text='FINISH']"));
    }
    public void verifyOrderComplete(){
        isVisible(By.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETE!']"));
    }
}

