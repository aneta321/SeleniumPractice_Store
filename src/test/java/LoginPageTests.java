import PageActions.LoginPageActions;
import PageObjects.LoginPageObjects;
import org.junit.jupiter.api.*;

import static PageObjects.HomePageObjects.LOGIN_PAGE_URL;
import static PageObjects.LoginPageObjects.MY_ACCOUNT_URL;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPageTests extends BaseTests {


    @Test
    @Order(1)
    public void getLoginPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
        Assertions.assertEquals(LOGIN_PAGE_URL, driver.getCurrentUrl(), "The url is not" + LOGIN_PAGE_URL);

    }

    @Test
    @Order(2)
    public void createAnAccount() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver, wait);
        loginPageActions.fillEmailAddressCreate().createAnAccountClick();
        //wait.until(ExpectedConditions.visibilityOf(loginPageObjects.registerForm));
    }

    @Test
    @Order(3)
    public void fillTheForm() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        loginPageActions.fillRegistrationForm();
        Assertions.assertEquals(MY_ACCOUNT_URL, driver.getCurrentUrl(), "URL is not " + MY_ACCOUNT_URL);
    }

    @Test
    @Order(4)
    public void signOutTest() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        loginPageActions.signOut();
        Assertions.assertEquals(LOGIN_PAGE_URL, driver.getCurrentUrl(), "The url is not" + LOGIN_PAGE_URL);
    }

    @Test
    @Order(5)
    public void signInTest() {
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        loginPageActions.signIn();
    }


}

