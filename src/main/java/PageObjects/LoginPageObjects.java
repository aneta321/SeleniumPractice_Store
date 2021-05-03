package PageObjects;


import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObjects extends BasePage {

    public LoginPageObjects(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public static final String EMAIL_ADDRESS_CREATE = "aneta39928800000000000511@gmail.com";
    //Registration Form
    public static final String FIRST_NAME = "Aneta";
    public static final String LAST_NAME = "Pasik";
    public static final String PASSWORD_CREATE = "Passw0rd";
    public static final String COMPANY = "My Company";
    public static final String STREET = "Złota";
    public static final String APARTMENT = "3/4";
    public static final String CITY = "Warsaw";
    public static final String POSTCODE = "00111";
    public static final String INFORMATION = "Hello";
    public static final String MOBILE_PHONE = "111222333";
    public static final String ADDRESS_ALIAS = "My address";
    public static final String MY_ACCOUNT_URL = "http://automationpractice.com/index.php?controller=my-account";
    public static final String EMAIL_ADDRESS_LOGIN = "aneta321@gmail.com";
    public static final String PASSWORD_LOGIN = "Passw0rd";

    @FindBy(xpath = "//input[@id = 'email_create']")
    public WebElement emailAddressCreateInput;

    @FindBy(xpath = "//button[@name='SubmitCreate']")
    public WebElement buttonCreateAccount;

    @FindBy(xpath = "//form[@id = 'account-creation_form']")
    public WebElement registerForm;

    @FindBy(xpath = "//input[@id = 'email']")
    public WebElement emailAddressLoginInput;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordLoginInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement signInButton;

    //Create An Account
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement mrsGenderRadioButton;

    @FindBy(xpath = "//input[@name='customer_firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='customer_lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='passwd']")
    public WebElement passwordCreateInput;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayOfBirth;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthOfBirth;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearOfBirth;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterCheckbox;

    @FindBy(xpath = "//input[@name='optin']")
    public WebElement specialOffers;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyInput;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement addressInput1;


    @FindBy(xpath = "//input[@name='address2']")
    public WebElement addressInput2;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postcodeInput;

    @FindBy(xpath = "//textarea[@name='other']")
    public WebElement additionalInformation;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//input[@name='alias']")
    public WebElement alias;

    @FindBy(xpath = "//button[@name='submitAccount']")
    public WebElement registerButton;

    @FindBy(className = "logout")
    public WebElement signOutbutton;






}
