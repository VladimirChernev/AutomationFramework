package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.enums.ProductName;
import utils.AutoComplete;
import utils.Browser;

public class LandingPage {

    public static void goTo() {
        Browser.driver.get("https://www.rakuten.de/");
    }


    public static void productSearch(ProductName productName) {
        WebElement usernameField = Browser.driver.findElement(By.id("q"));
        usernameField.sendKeys(productName.getProductName());
        AutoComplete.selectOption(productName);
    }

}
