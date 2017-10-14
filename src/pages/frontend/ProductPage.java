package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.enums.ProductColor;

import static utils.Browser.driver;

public class ProductPage {

    public static void clickToCart() {
        driver.findElement(By.xpath("//input[@class='button_addtocart rakuten_add_to_cart rakuten_add_to_cart rakuten_1888707440_add_to_cart']")).click();
    }

    public static void selectProductColor(ProductColor color) {
        new Select(driver.findElement(By.id("rakuten_control_variant_1"))).selectByVisibleText("Coral Blue");
    }

    public static void fancyBoxClickToCart() {
        driver.findElement(By.id("atc_b_tsc")).click();
    }

}
