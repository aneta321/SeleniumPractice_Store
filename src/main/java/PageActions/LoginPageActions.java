package PageActions;

import PageObjects.LoginPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions extends LoginPageObjects {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPageActions(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }


    public LoginPageActions fillEmailAddressCreate(){
        emailAddressCreateInput.sendKeys(EMAIL_ADDRESS_CREATE);
        return new LoginPageActions(driver, wait);
    }

    public LoginPageActions createAnAccountClick(){
        buttonCreateAccount.click();
        wait.until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"));
        return new LoginPageActions(driver, wait);
    }


    public LoginPageActions fillRegistrationForm() {
        Actions action = new Actions(driver);

        action.click(mrsGenderRadioButton).build().perform();
        firstNameInput.sendKeys(FIRST_NAME);
        lastNameInput.sendKeys(LAST_NAME);
        passwordCreateInput.sendKeys(PASSWORD_CREATE);

        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByValue("3");

        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByIndex(6);

        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByValue("2000");

        newsletterCheckbox.click();
        specialOffers.click();
        companyInput.sendKeys(COMPANY);
        addressInput1.sendKeys(STREET);
        addressInput2.sendKeys(APARTMENT);
        cityInput.sendKeys(CITY);

        Select selectState = new Select(state);
        selectState.selectByIndex(13);

        postcodeInput.sendKeys(POSTCODE);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        additionalInformation.sendKeys(INFORMATION);
        mobilePhone.sendKeys(MOBILE_PHONE);
        alias.clear();
        alias.sendKeys(ADDRESS_ALIAS);
        registerButton.click();

        return new LoginPageActions(driver, wait);

    }

    public LoginPageActions signOut() {
        signOutbutton.click();
        return new LoginPageActions(driver, wait);
    }

    public LoginPageActions signIn() {
        emailAddressLoginInput.sendKeys(EMAIL_ADDRESS_LOGIN);
        passwordLoginInput.sendKeys(PASSWORD_LOGIN);
        signInButton.click();
        return new LoginPageActions(driver, wait);
    }
}
