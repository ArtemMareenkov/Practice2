package practice5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import practice5.pages.fragments.FooterFragment;
import practice5.pages.fragments.HeaderFragment;

/**
 * Created by Serhii on 14-Dec-16.
 */
public class MainPage extends AbstractPage{

    public static final String URL = "https://www.amazon.com/";

    private HeaderFragment header;
    private FooterFragment footer;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open() {
        driver.get(URL);
        return this;
    }

    public HeaderFragment getHeader() {
        return new HeaderFragment(driver);
    }

    //TODO Main Page logic



}
