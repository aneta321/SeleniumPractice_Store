package PageActions;


import PageObjects.HomePageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageActions extends HomePageObjects {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePageActions(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

        PageFactory.initElements(driver, this);
    }


    public HomePageActions clickSignIn() {
        buttonSignIn.click();
        return new HomePageActions(driver, wait);
    }
}
