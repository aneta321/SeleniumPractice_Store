package PageObjects;


import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageObjects extends BasePage {

    public HomePageObjects(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public static final String HOME_PAGE_TITLE = "My Store";
    public static final String LOGIN_PAGE_TITLE = "Login - My Store";


    @FindBy(xpath = "//a[@title=\"Log in to your customer account\"]")
    protected WebElement buttonSignIn;
}
