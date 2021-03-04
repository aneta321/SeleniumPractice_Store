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

    public static final String HOME_PAGE_URL = "http://automationpractice.com/index.php";
    public static final String LOGIN_PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";


    @FindBy(xpath = "//a[@title=\"Log in to your customer account\"]")
    protected WebElement buttonSignIn;
}
