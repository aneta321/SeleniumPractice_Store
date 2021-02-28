import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTests {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeAll
    public void driverSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.manage().window().setSize(new Dimension(1290, 730));
        driver.manage().window().setPosition(new Point(8, 30));
        wait = new WebDriverWait(driver, 1);
        driver.navigate().to("http://automationpractice.com/index.php");
    }

//    @AfterAll
//    public void driverQuit() {
//        driver.quit();
//    }

    }

