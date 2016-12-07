package practice4.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import practice4.pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Serhii on 30-Nov-16.
 */
public class LoginTests {

    private static WebDriver driver; // Declare var
    private static LoginPage loginPage;
    private SoftAssert softAssert;

    @BeforeSuite
    public void beforeTest() {
        //open browser
        driver = new FirefoxDriver(); //initialize/create object/open firefox
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        loginPage.open(); //open poker URL
    }

    @BeforeMethod
    public void beforeMethod() {
        loginPage.open();
        softAssert = new SoftAssert();
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][] {
                {"admin", "1234", "Login", "Invalid username or password"},
                {"admin123", "123", "Login", "Invalid username or password"}
        };
    }

    @Test(dataProvider = "loginData")
    public void negativeTestWrongPasssord(String username, String password, String title, String expectedMsg){
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickOnLogin();
        String actualMsg = loginPage.getErrorMessage();
        softAssert.assertEquals(driver.getCurrentUrl(), LoginPage.URL, "You are NOT on login page.");
        softAssert.assertEquals(driver.getTitle(), title, "Wrong title after unsuccessful login");
        softAssert.assertEquals(actualMsg, expectedMsg, "Validation error message is not valid.");
        softAssert.assertAll();
    }

    @Parameters({"usrn", "pswrd", "ttl"})
    @Test
    public void aPositiveTest(String username, String password, String title) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickOnLogin();
        softAssert.assertEquals(driver.getTitle(), title, "Wrong title after login");
        softAssert.assertNotEquals(driver.getCurrentUrl(), LoginPage.URL, "You are still on login page.");
        softAssert.assertAll();
    }


    @AfterSuite
    public void afterTest() {
        //close browser
        driver.quit();
    }







}
