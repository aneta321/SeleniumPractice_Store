import PageActions.LoginPageActions;
import org.junit.jupiter.api.*;

import static PageObjects.HomePageObjects.LOGIN_PAGE_TITLE;
import static PageObjects.LoginPageObjects.MY_ACCOUNT_URL;

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
        loginPageActions.fillEmailAddressCreate().createAnAccountClick();
    }

    @Test
    @Order(3)
    public void fillTheForm() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        loginPageActions.fillRegistrationForm();
        Assertions.assertEquals(MY_ACCOUNT_URL, driver.getCurrentUrl(), "URL is not " + MY_ACCOUNT_URL);
    }
}
