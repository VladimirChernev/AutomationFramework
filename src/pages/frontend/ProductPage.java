package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.enums.ProductColor;
import static utils.Browser.driver;

public class ProductPage {

    //get all elements from the page:
    private static WebElement getToCartBtn() {
        return driver.findElement(By.xpath("//input[@class='button_addtocart rakuten_add_to_cart rakuten_add_to_cart rakuten_1888707440_add_to_cart']"));
    }
    private static WebElement getProductColorSelector() {
        return driver.findElement(By.id("rakuten_control_variant_1"));
    }
    private static WebElement getFancyBoxToCartBtn() {
        return driver.findElement(By.id("atc_b_tsc"));
    }

    //Actions on the page:
    public static void clickToCartBtn() {
        getToCartBtn().click();
    }
    public static void selectProductColor(ProductColor color) {
        new Select(getProductColorSelector()).selectByVisibleText(color.getProductColor());
    }
    public static void clickFancyBoxToCartBtn() {
        getFancyBoxToCartBtn().click();
    }

}
