package pages.frontend;

import org.openqa.selenium.By;
import pages.enums.ProductLink;
import utils.Browser;

public class SearchResultsPage {

    public static void clickOnProduct(ProductLink productLink) {
        Browser.driver.findElement(By.xpath("//a[@href ='" + productLink.getProductLink() + "']")).click();
    }

}
