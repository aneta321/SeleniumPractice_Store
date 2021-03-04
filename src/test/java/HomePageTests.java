import PageActions.HomePageActions;
import org.junit.jupiter.api.*;

import static PageObjects.HomePageObjects.HOME_PAGE_URL;
import static PageObjects.HomePageObjects.LOGIN_PAGE_URL;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HomePageTests extends BaseTests {




    @Test
    @Order(1)
    public void getStorePageTest() throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertEquals(HOME_PAGE_URL, driver.getTitle(), "The url is not" + HOME_PAGE_URL);
    }

    @Test
    @Order(2)
    public void signInTest() {
        HomePageActions homePageActions = new HomePageActions(driver, wait);
        homePageActions.clickSignIn();
        Assertions.assertEquals(LOGIN_PAGE_URL, driver.getCurrentUrl(), "The url is not" + LOGIN_PAGE_URL);


    }
}
