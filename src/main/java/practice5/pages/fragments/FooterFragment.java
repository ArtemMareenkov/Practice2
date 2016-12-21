package practice5.pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Serhii on 14-Dec-16.
 */
public class FooterFragment {


    private WebDriver driver;

    public FooterFragment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }





}
