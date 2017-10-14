package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.enums.ProductLink;
import static utils.Browser.driver;

public class SearchResultsPage {

    //get all elements from the page:
    private static WebElement getProductLink(ProductLink productLink) {
        return driver.findElement(By.xpath("//a[@href ='" + productLink.getProductLink() + "']"));
    }

    //Actions on the page:
    public static void clickOnProductLink(ProductLink productLink) {
        getProductLink(productLink).click();
    }

}
