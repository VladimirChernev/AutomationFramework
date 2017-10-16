package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.enums.EnvironmentURL;
import pages.enums.ProductName;

import static utils.Browser.driver;

public class LandingPage {

    //get all elements from the page:
    private static WebElement getSearchBox() {
        return driver.findElement(By.id("q"));
    }
    private static WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//*[@class='b-btn-search tr_header_search_icon']"));
    }
    private static WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//*[@class='tr_header_login']"));
    }

    //Actions on the page:
    public static void goTo(EnvironmentURL environmentURL) {
        driver.get(environmentURL.getEnvironmentURL());
    }

    public static void productSearch(ProductName productName) {
        getSearchBox().sendKeys(productName.getProductName());
        clickSearchButton();
    }

    public static void clickSearchButton() {
        getSearchBtn().click();
    }

    public static void clickLoginBtn() {
        getLoginBtn().click();
    }


}
