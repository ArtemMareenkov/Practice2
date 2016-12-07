package practice4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Serhii on 30-Nov-16.
 */
public class LoginPage {

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "logIn")
    private WebElement logInBtn;

    private WebDriver driver;

    public static final String URL = "http://80.92.229.236:81/auth/login";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(URL);
    }

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickOnLogin();
    }

    public void setUsername(String username) {
        usernameInput.clear();
        usernameInput.sendKeys(username); // Set username
    }

    public void setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password); // Set password
    }

    public void clickOnLogin() {
        logInBtn.click(); // click on LogIn button
    }

    public String getErrorMessage() {
        WebElement errorMsgElement = driver.findElement(By.xpath("//ul[@class='errors']/li"));
        String errorMsg = errorMsgElement.getText();
        return errorMsg;
    }
}
