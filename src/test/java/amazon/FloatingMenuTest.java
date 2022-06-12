package amazon;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class FloatingMenuTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(FloatingMenuTest.class);

    @Test(enabled = false)
    public void floatingMenu(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnLoginBtn();
        String text = loginPage.getHeaderText();
        Assert.assertEquals("Email or mobile phone number", text);
    }
    @Test
    public void validateLoginPage(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickOnLoginBtn();
        Assert.assertFalse(loginPage.checkLogoIsPresent());
    }
}
