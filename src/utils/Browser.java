package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public static void init() {

		// chromedriver 2.33 win x32
		System.setProperty("webdriver.chrome.driver", "C:/Zip/Docs/Work/Java Dev Course/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}

	/* Future Improvements
	static synchronized public void buildDriver() {
		SeleniumWebDriver.setWebDriver();
		SeleniumWebDriver.getWebDriver().get(envUrl);
		SeleniumWebDriver.getWebDriver().manage().window().maximize();
		SeleniumWebDriver.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SeleniumWebDriver.getWebDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		SeleniumWebDriver.getWebDriver().manage().deleteAllCookies();
	}
	*/
}
