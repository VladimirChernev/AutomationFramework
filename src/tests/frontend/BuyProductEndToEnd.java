package tests.frontend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.backend.AdminDashboard;
import pages.backend.AdminLogin;
import pages.enums.Password;
import pages.enums.ProductName;
import pages.enums.Username;
import pages.frontend.LandingPage;
import utils.Browser;

public class BuyProductEndToEnd {

    @Before
    public void setup(){
        Browser.init();
    }

    @Test
    public void successfulBuyProductEndToEnd(){
        LandingPage.goTo();
        LandingPage.productSearch(ProductName.SAMSUNGGALAXYS8);

        //Search Results Page...

        //AdminLogin.login(Username.ADMIN, Password.ADMINPASSWORD);
        //AdminDashboard.verifyPageTitle("Dashboard");
    }

    @After
    public void tearDown(){
        Browser.quit();
    }

}
