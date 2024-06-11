package Utils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class Hooks extends Driver {
    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = Driver.createDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
