package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Browser.driver;

public class ShoppingCartPage {

    //get all elements from the page:
    private static WebElement getGoToCheckoutBtn() {
        return driver.findElement(By.id("go_to_checkout"));
    }

    //Actions on the page:
    public static void clickGoToCheckoutBtn() {
        getGoToCheckoutBtn().click();
    }

}
