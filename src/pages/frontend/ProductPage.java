package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static utils.Browser.driver;

public class ProductPage {

    public static void goToCart() {
        new Select(driver.findElement(By.id("rakuten_control_variant_1"))).selectByVisibleText("Coral Blue");
        driver.findElement(By.linkText("in the cart")).click();
    }

}
