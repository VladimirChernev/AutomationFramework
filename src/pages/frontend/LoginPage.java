package pages.frontend;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.enums.Password;
import pages.enums.Username;
import utils.Browser;

import static utils.Browser.driver;

public class LoginPage {

    //get all elements from the page:
    private static WebElement getEmailField() {
        return driver.findElement(By.name("loginEmail"));
    }
    private static WebElement getPasswordField() {
        return driver.findElement(By.name("loginPassword"));
    }
    private static WebElement getLoginBtn() {
        return driver.findElement(By.name("submit"));
    }
    private static WebElement getForgottenPasswordBtn() {
        return driver.findElement(By.xpath("//a[@href='https://www.rakuten.de/kundenkonto/passwort']"));
    }
    private static WebElement getFancyBoxEmailField() {
        return driver.findElement(By.xpath("//*[@jqtranformdone rak-input']"));
    }
    private static WebElement getFancyBoxRequestNewPassBtn() {
        return driver.findElement(By.xpath("//a[@href='https://www.rakuten.de/kundenkonto/passwort']"));
    }

    //Actions on the page:
    public static void fillEmailField(Username username) {
        getEmailField().sendKeys(username.getUsername());
    }
    public static void fillPasswordField(Password password) {
        getPasswordField().sendKeys(password.getPassword());
    }
    public static void clickLoginBtn() {
        getLoginBtn().click();
    }
    public static void clickForgottenPasswordBtn() {
        getForgottenPasswordBtn().click();
    }
    public static void verifyErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = Browser.driver.findElement(By.xpath("//div[@class='message-error']")).getText();
        Assert.assertEquals("Page error message is not as expected, failing the test.", expectedErrorMessage, actualErrorMessage);
    }

}
