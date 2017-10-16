package tests.frontend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.enums.EnvironmentURL;
import pages.enums.Password;
import pages.enums.Username;
import pages.frontend.CustomerAccountOverviewPage;
import pages.frontend.LandingPage;
import pages.frontend.LoginPage;
import utils.Browser;

public class Login {

    @Before
    public void setup(){
        Browser.init();
    }

    @Test
    public void successfulLogin(){
        LandingPage.goTo(EnvironmentURL.LIVE);
        LandingPage.clickLoginBtn();
        LoginPage.fillEmailField(Username.VALIDEMAIL);
        LoginPage.fillPasswordField(Password.VALIDPASSWORD);
        LoginPage.clickLoginBtn();
        CustomerAccountOverviewPage.clickAccountInfoDD();
        CustomerAccountOverviewPage.clickAccountLogoutBtn();
    }

    @Test
    public void unsuccessfulLoginWrongEmailAndPass() {
        LandingPage.goTo(EnvironmentURL.LIVE);
        LandingPage.clickLoginBtn();
        LoginPage.fillEmailField(Username.WRONGEMAIL);
        LoginPage.fillPasswordField(Password.WRONGPASSWORD);
        LoginPage.clickLoginBtn();
        LoginPage.verifyErrorMessage("Diese E-Mail-Passwort-Kombination ist uns nicht bekannt. Bitte korrigieren Sie Ihre Eingabe.");
        //Error message: This e-mail-password combination is not known to us. Please correct your entry.
    }

    @Test
    public void unsuccessfulLoginWrongPass() {
        LandingPage.goTo(EnvironmentURL.LIVE);
        LandingPage.clickLoginBtn();
        LoginPage.fillEmailField(Username.VALIDEMAIL);
        LoginPage.fillPasswordField(Password.WRONGPASSWORD);
        LoginPage.clickLoginBtn();
        LoginPage.verifyErrorMessage("Diese E-Mail-Passwort-Kombination ist uns nicht bekannt. Bitte korrigieren Sie Ihre Eingabe.");
        //Error message: This e-mail-password combination is not known to us. Please correct your entry.
    }

    /*
    @Test
    public void loginForgottenPassword() {
        LandingPage.goTo(EnvironmentURL.LIVE);
        LandingPage.clickLoginBtn();
        LoginPage.clickForgottenPasswordBtn();
    }
    */

    @After
    public void tearDown(){
        Browser.quit();
    }

}
