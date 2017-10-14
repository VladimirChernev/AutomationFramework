package pages.frontend;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Browser;


import static utils.Browser.driver;

public class CheckoutPage3 {

    //Actions on the page:
    public static void verifyPageTitle(String expectedPageTitle) {
        String actualPageTitle = Browser.driver.getTitle();
        Assert.assertEquals("The title is not as expected, failing the test.", expectedPageTitle, actualPageTitle);
    }

}
