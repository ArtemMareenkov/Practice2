package practice5.pages.fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import practice5.pages.MainPage;
import practice5.pages.helpers.HeaderLinksEnum;

/**
 * Created by Serhii on 14-Dec-16.
 */
public class HeaderFragment {

    private WebDriver driver;

    public HeaderFragment(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    public HeaderFragment clickOnLink(HeaderLinksEnum link){
        driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[contains(.,'" + link.getPartOfLinkText() + "')]")).click();
        driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[contains(.,'Sell')]")).click();
        return this;
    }

}
