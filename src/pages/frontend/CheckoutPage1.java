package pages.frontend;

import org.openqa.selenium.By;

import static utils.Browser.driver;

public class CheckoutPage1 {

    public static void selectCheckoutAsGuest() {
        driver.findElement(By.id("login-method1")).click();
    }

    public static void clickGoToCheckoutPage2() {
        driver.findElement(By.id("go_to_next_step")).click();
    }

}
