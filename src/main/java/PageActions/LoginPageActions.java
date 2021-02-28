package PageActions;

import PageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions extends LoginPageObjects {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPageActions(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }


    public LoginPageActions fillEmailAddressCreate(){
        emailAddressCreateInput.sendKeys(EMAIL_ADDRESS_CREATE);
        return new LoginPageActions(driver, wait);
    }

    public LoginPageActions createAnAccountClick(){
        buttonCreateAccount.click();
        return new LoginPageActions(driver, wait);
    }
}
