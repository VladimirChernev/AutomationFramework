package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Address;
import static utils.Browser.driver;

public class CheckoutPage2 {

    //get all elements from the page:
    private static WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }
    private static WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }
    private static WebElement getStreetField() {
        return driver.findElement(By.id("street"));
    }
    private static WebElement getStreetNumberField() {
        return driver.findElement(By.id("street-number"));
    }
    private static WebElement getZipCodeField() {
        return driver.findElement(By.id("zip-code"));
    }
    private static WebElement getCityField() {
        return driver.findElement(By.id("city"));
    }
    private static WebElement getEmailField() {
        return driver.findElement(By.id("email"));
    }
    private static WebElement getTitleDD() {
        return driver.findElement(By.xpath("//*[@class='field-container gender-container'] //a"));
    }
    private static WebElement getTitleSelect(String index) {
        return driver.findElement(By.xpath("//*[@class='field-container gender-container'] //li //*[@index = '"+index+"']"));
    }
    //Data
    private static WebElement getDataDD() {
        return driver.findElement(By.xpath("//*[@id='invoice-day-container'] //a"));
    }
    private static WebElement getDataSelect(String index) {
        return driver.findElement(By.xpath("//*[@id='invoice-day-container'] //li //a[@index='"+index+"']"));
    }
    //Month
    private static WebElement getMonthDD() {
        return driver.findElement(By.xpath("//*[@id='invoice-month-container'] //a"));
    }
    private static WebElement getMonthSelect(String index) {
        return driver.findElement(By.xpath("//*[@id='invoice-month-container'] //li //a[@index='"+index+"']"));
    }
    //Year
    private static WebElement getYearDD() {
        return driver.findElement(By.xpath("//*[@id='invoice-year-container'] //a"));
    }
    private static WebElement getYearSelect(String index) {
        return driver.findElement(By.xpath("//*[@id='invoice-year-container'] //li //a[@index='"+index+"']"));
    }
    //Privacy Checkbox
    private static WebElement getPrivacyCheckbox() {
        return driver.findElement(By.id("privacy"));
    }
    private static WebElement getNextPageBtn() {
        return driver.findElement(By.id("go_to_next_step"));
    }

    //Actions on the page:
    public static void fillPersonData(Address validGermanAddress) {
        getTitleDD().click();
        getTitleSelect("2").click();
        getFirstNameField().sendKeys(validGermanAddress.firstName);
        getLastNameField().sendKeys(validGermanAddress.lastName);
        getStreetField().sendKeys(validGermanAddress.streetName);
        getStreetNumberField().sendKeys(validGermanAddress.streetNumber);
        getZipCodeField().sendKeys(validGermanAddress.zipCode);
        getCityField().sendKeys(validGermanAddress.city);
        getEmailField().sendKeys(validGermanAddress.email);
        getDataDD().click();
        getDataSelect("3").click();
        getMonthDD().click();
        getMonthSelect("3").click();
        getYearDD().click();
        getYearSelect("10").click();
        getPrivacyCheckbox().click();
    }

    public static void clickGoToCheckoutPage3() {
        getNextPageBtn().click();
    }

}
