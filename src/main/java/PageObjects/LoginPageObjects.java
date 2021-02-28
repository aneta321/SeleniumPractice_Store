package PageObjects;


import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObjects extends BasePage {

    public LoginPageObjects(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public static final String EMAIL_ADDRESS_CREATE = "aneta321@gmail.com";
    public static final String LOGIN_PAGE_TITLE = "Login - My Store";

    @FindBy(xpath = "//input[@id = 'email_create']")
    public WebElement emailAddressCreateInput;

    @FindBy(xpath = "//button[@name='SubmitCreate']")
    public WebElement buttonCreateAccount;

    @FindBy(xpath = "//input[@id = 'email']")
    public WebElement emailAddressLoginInput;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement buttonSignIn;


}
