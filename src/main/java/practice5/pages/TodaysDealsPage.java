package practice5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import practice5.pages.fragments.HeaderFragment;

/**
 * Created by Serhii on 14-Dec-16.
 */
public class TodaysDealsPage {

    private WebDriver driver;

    public TodaysDealsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HeaderFragment getHeader() {
        return new HeaderFragment(driver);
    }


    //TODO TodaysDealsPage logic

}
