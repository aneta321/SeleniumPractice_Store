import PageActions.HomePageActions;
import org.junit.jupiter.api.*;

import static PageObjects.HomePageObjects.HOME_PAGE_TITLE;
import static PageObjects.HomePageObjects.LOGIN_PAGE_TITLE;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HomePageTests extends BaseTests {




    @Test
    @Order(1)
    public void getStorePageTest() throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertEquals(HOME_PAGE_TITLE, driver.getTitle(), "The title of this page is not" + HOME_PAGE_TITLE);
    }

    @Test
    @Order(2)
    public void signInTest() {
        HomePageActions homePageActions = new HomePageActions(driver, wait);
        homePageActions.clickSignIn();
        Assertions.assertEquals(LOGIN_PAGE_TITLE, driver.getTitle(), "The title is not" + LOGIN_PAGE_TITLE);

    }
}
