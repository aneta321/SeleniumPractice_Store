import PageActions.LoginPageActions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static PageObjects.HomePageObjects.LOGIN_PAGE_TITLE;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPageTests extends BaseTests {


    @Test
    @Order(1)
    public void getLoginPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
        Assertions.assertEquals(LOGIN_PAGE_TITLE, driver.getTitle(), "The title is not" + LOGIN_PAGE_TITLE);

    }

    @Test
    @Order(2)
    public void createAnAccount() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        wait.until(ExpectedConditions.visibilityOf(loginPageActions.buttonCreateAccount));
        loginPageActions.fillEmailAddressCreate().createAnAccountClick();
    }
}
