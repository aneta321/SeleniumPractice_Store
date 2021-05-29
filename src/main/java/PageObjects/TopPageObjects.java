package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopPageObjects extends BasePage {
    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womanList;

    public static final String LOGIN_CONFIRM_URL = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=&submit_search=";


    @FindBy(xpath = "//a[@class = 'login']")
    public WebElement signInButton;
    @FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']")
    public WebElement womanSection;

    public TopPageObjects(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


}

