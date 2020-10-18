package login;

import pages.LoginPage;
import pages.SecureAreaPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertEquals(secureAreaPage.getAlertText(),
                "You logged into a secure area!\n" +
                        "×",
                "Alert text incorrect.");
    }

}
