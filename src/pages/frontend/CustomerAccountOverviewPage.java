package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Browser.driver;

public class CustomerAccountOverviewPage {

    //get all elements from the page:
    private static WebElement getAccountInfoDD() {
        return driver.findElement(By.xpath("//li[@class='b-dropdown b-account-info tr_header_account_name']"));
    }
    private static WebElement getAccountLogoutBtn() {
        return driver.findElement(By.xpath("//a[@class='tr_header_account_logout']"));
    }

    //Actions on the page:
    public static void clickAccountInfoDD() {
        getAccountInfoDD().click();
    }
    public static void clickAccountLogoutBtn() {
        getAccountLogoutBtn().click();
    }

}
