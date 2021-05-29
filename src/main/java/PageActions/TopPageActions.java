package PageActions;

import PageObjects.TopPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public TopPageObjects chooseWomenCard() {
        Actions action = new Actions(driver);
        action.moveToElement(womanList).build().perform();
        wait.until(ExpectedConditions.visibilityOf(womanSection));
        return new TopPageObjects(driver, wait);
    }



}
