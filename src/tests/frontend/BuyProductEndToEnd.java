package tests.frontend;

import org.junit.Before;
import org.junit.Test;

//import pages.enums.Password;
import pages.enums.EnvironmentURL;
import pages.enums.ProductColor;
import pages.enums.ProductLink;
import pages.enums.ProductName;
//import pages.enums.Username;
import pages.frontend.*;
import utils.Address;
import utils.Browser;

public class BuyProductEndToEnd {

    @Before
    public void setup(){
         Browser.init();
    }

    @Test
    public void successfulBuyProductEndToEnd(){
        //generating Address Data
        Address validGermanAddress = new Address();
        validGermanAddress.generateAddress();

        LandingPage.goTo(EnvironmentURL.LIVE);
        LandingPage.productSearch(ProductName.SAMSUNGGALAXYS8);
        SearchResultsPage.clickOnProduct(ProductLink.SAMSUNGGALAXYS8);
        ProductPage.selectProductColor(ProductColor.CORALBLUE);
        ProductPage.clickToCart();
        ProductPage.fancyBoxClickToCart();
        ShoppingCartPage.clickGoToCheckout();
        CheckoutPage1.selectCheckoutAsGuest();
        CheckoutPage1.clickGoToCheckoutPage2();
        CheckoutPage2.fillPersonData(validGermanAddress);
        CheckoutPage2.clickGoToCheckoutPage3();

        //AdminDashboard.verifyPageTitle("Dashboard");
    }
    /*
    @After
    public void tearDown(){
        Browser.quit();
    }
*/
}
