package pages.backend;


import org.junit.Assert;

import utils.Browser;

public class AdminDashboard {

	public static void verifyPageTitle(String expectedPageTitle) {
		String actualPageTitle = Browser.driver.getTitle();

		Assert.assertEquals("The title is not as expected, failing the test.", expectedPageTitle, actualPageTitle);
	}

}
