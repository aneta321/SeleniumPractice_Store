package PageActions;

import PageObjects.TopPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopPageActions extends TopPageObjects {

    private WebDriver driver;
    private WebDriverWait wait;


    public TopPageActions(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }


    public TopPageActions signInButtonClick() {
        signInButton.click();
        return new TopPageActions(driver, wait);
    }

}
