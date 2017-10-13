package tests.backend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.backend.AdminDashboard;
import pages.backend.AdminLogin;
import pages.enums.Password;
import pages.enums.Username;
import utils.Browser;

public class AdminLoginTests {

	@Before
	public void setup(){
		Browser.init();
	}
	
	@Test
	public void succesfulLogin(){
		AdminLogin.goTo();
		AdminLogin.login(Username.ADMIN, Password.ADMINPASSWORD);

		AdminDashboard.verifyPageTitle("Dashboard");
	}
	
	@Test
	public void unsuccesfulLogin() {
		AdminLogin.goTo();
		AdminLogin.login(Username.BULLSHITUSER, Password.BULLSHITPASSWORD);
		
		AdminLogin.verifyValidationMessage("No match for Username and/or Password.");
	}
	
	@After
	public void tearDown(){
		Browser.quit();
	}
	
}
;