package pages.frontend;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Browser;

public class CheckoutPage3 {

    //Actions on the page:
    public static void verifyPageTitle(String expectedPageTitle) {
        String actualPageTitle = Browser.driver.getTitle();
        Assert.assertEquals("The title is not as expected, failing the test.", expectedPageTitle, actualPageTitle);
    }
    public static void verifyPageText(String expectedValidationMessage) {
        String actualValidationMessage = Browser.driver.findElement(By.xpath("//div[@id='content'] //h2")).getText();
        Assert.assertEquals("Page text is not as expected, failing the test.", expectedValidationMessage, actualValidationMessage);
    }

}
