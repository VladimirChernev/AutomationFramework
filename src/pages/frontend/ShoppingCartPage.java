package pages.frontend;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class ShoppingCartPage {

    public static void clickGoToCheckout() {
        driver.findElement(By.id("go_to_checkout")).click();
    }

}
