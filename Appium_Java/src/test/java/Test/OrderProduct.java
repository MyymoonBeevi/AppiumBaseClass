package Test;

import Page.OrderProductPage;
import Utils.Hooks;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OrderProduct extends Hooks {

   @Test
    public void SuccessfullyOrderProduct(){
       Login login = new Login();
       OrderProductPage order = new OrderProductPage(driver);
       login.successfulLoginTest();
       order.addProductToCart();
       order.goToCart();
       order.checkoutProduct("Santhiya","Ram","630311");
       order.verifyOrderComplete();
   }
}
