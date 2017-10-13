package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public static void init() {

		// geckodriver-v0.19.0-win64.zip
		System.setProperty("webdriver.gecko.driver", "C:/Zip/Docs/Work/Java Dev Course/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}

}
