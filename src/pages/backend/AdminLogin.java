package pages.backend;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.enums.Password;
import pages.enums.Username;
import utils.Browser;

public class AdminLogin {

	public static void goTo() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * This method tries to log you in the ADmin Login Panel with the
	 * provided by you parameters. It clicks "LOGIN" instead of you doing it in 
	 * another method.
	 * 
	 * @author Strahinski
	 * @see http://documentation.com
	 * @since 1985
	 * 
 	 * @param username the username that should be used when trying to login
	 * @param password the password that shoul dbe used when trying to login
	 */
	public static void login(Username username, Password password) {
		WebElement usernameField = Browser.driver.findElement(By.name("username"));
		usernameField.sendKeys(username.getUsername());
		
		Browser.driver.findElement(By.name("password")).sendKeys(password.getPassword());
		
		Browser.driver.findElement(By.linkText("Login")).click();
	}

	public static void verifyValidationMessage(String expectedValidationMessage) {
		String actualValidationMessage = Browser.driver.findElement(By.className("warning")).getText();
		Assert.assertEquals("The validation message is not as expected, failing test.", expectedValidationMessage, actualValidationMessage);
	}

}
