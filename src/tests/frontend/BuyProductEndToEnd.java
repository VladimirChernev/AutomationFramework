package tests.frontend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import pages.enums.Password;
import pages.enums.ProductLink;
import pages.enums.ProductName;
//import pages.enums.Username;
import pages.frontend.LandingPage;
import pages.frontend.ProductPage;
import pages.frontend.SearchResultsPage;
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
        SearchResultsPage.clickOnProduct(ProductLink.SAMSUNGGALAXYS8);
        ProductPage.goToCart();

        //Pop-Up?
        //ShopcartPage
        //Checkout1
        //Checkout2
        //Checkout3


        //AdminLogin.login(Username.ADMIN, Password.ADMINPASSWORD);
        //AdminDashboard.verifyPageTitle("Dashboard");
    }

    @After
    public void tearDown(){
        Browser.quit();
    }

}
