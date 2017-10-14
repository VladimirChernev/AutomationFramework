package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.enums.EnvironmentURL;
import pages.enums.ProductName;
import utils.Browser;

import static utils.Browser.driver;

public class LandingPage {

    public static void goTo(EnvironmentURL environmentURL) {
        driver.get(environmentURL.getEnvironmentURL());
    }

    public static void productSearch(ProductName productName) {
        WebElement usernameField = driver.findElement(By.id("q"));
        usernameField.sendKeys(productName.getProductName());
        Browser.driver.findElement(By.xpath("//button[@class='b-btn-search tr_header_search_icon']")).click();
    }

}
