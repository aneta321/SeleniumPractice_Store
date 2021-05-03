import PageActions.LoginPageActions;
import PageActions.TopPageActions;
import org.junit.jupiter.api.*;

import static PageObjects.TopPageObjects.LOGIN_CONFIRM_URL;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class TopPageTest extends BaseTests {


    @Test
    @Order(1)
    public void logIn() {
        TopPageActions topPageActions = new TopPageActions(driver, wait);
        topPageActions.signInButtonClick();
        LoginPageActions loginPageActions = new LoginPageActions(driver, wait);
        loginPageActions.signIn();
        Assertions.assertEquals(LOGIN_CONFIRM_URL, driver.getCurrentUrl(), "The url is not\" + LOGIN_CONFIRM_URL");
    }
}



