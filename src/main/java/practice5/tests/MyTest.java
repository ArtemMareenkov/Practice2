package practice5.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice5.pages.MainPage;
import practice5.pages.TodaysDealsPage;
import practice5.pages.helpers.HeaderLinksEnum;

import java.util.concurrent.TimeUnit;

/**
 * Created by Serhii on 14-Dec-16.
 */
public class MyTest extends TestBase {

    private WebDriver driver;

    @Test
    public void test1222() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .getHeader()
                .clickOnLink(HeaderLinksEnum.TODAYS_DEALS)
                .clickOnLink(HeaderLinksEnum.SELL)
                .clickOnLink(HeaderLinksEnum.GIFT_CARDS_REGISTRY);
        Assert.fail();
    }





}
