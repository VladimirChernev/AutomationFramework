package tests.frontend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.enums.EnvironmentURL;
import pages.enums.ProductColor;
import pages.enums.ProductLink;
import pages.enums.ProductName;
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
        SearchResultsPage.clickOnProductLink(ProductLink.SAMSUNGGALAXYS8);
        ProductPage.selectProductColor(ProductColor.CORALBLUE);
        ProductPage.clickToCartBtn();
        ProductPage.clickFancyBoxToCartBtn();
        ShoppingCartPage.clickGoToCheckoutBtn();
        CheckoutPage1.selectCheckoutAsGuest();
        CheckoutPage1.clickGoToCheckoutPage2();
        CheckoutPage2.fillPersonData(validGermanAddress);
        CheckoutPage2.clickGoToCheckoutPage3();
        CheckoutPage3.verifyPageTitle("Rakuten.de Checkout");
    }

    @After
    public void tearDown(){
        Browser.quit();
    }

}
