package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import static org.openqa.selenium.By.xpath;
public class AutomationExercise {



        public AutomationExercise(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath="//i[@class='fa fa-lock']")
        public WebElement signup;

        @FindBy(xpath="//div[@class='signup-form']")
        public WebElement newusertitle;

        @FindBy(xpath="//*[@data-qa='signup-name']")
        public WebElement name;

        @FindBy(xpath="//input[@data-qa='signup-email']")
        public WebElement email;

        @FindBy(xpath="//*[@data-qa='signup-button']")
        public WebElement signUpButton;

        @FindBy(xpath="//div[@class='radio-inline'][2]")
        public WebElement accountVisible;

        @FindBy(xpath="//input[@type='checkbox'])[1]")
        public WebElement signupNewsletterCheckbox;

        @FindBy(xpath="//input[@id='optin']")
        public WebElement receiveCheckbox;

        @FindBy(id="first_name")
        public WebElement firstName;

        @FindBy(xpath="//select[@id='country']")
        public WebElement country;

        @FindBy(xpath="//button[@class='btn btn-default'])[1]")
        public WebElement createAccount;

        @FindBy(xpath="//h2[@class='title text-center']")
        public WebElement createAccountIsVisible;

        @FindBy(xpath="//a[@class='btn btn-primary']")
        public WebElement continueButton;

        @FindBy(xpath="//i[@class='fa fa-user']")
        public WebElement loggedUsername;

        @FindBy(xpath="//i[@class='fa fa-trash-o']")
        public WebElement deleteAccountButton;

        @FindBy(xpath="//a[@class='btn btn-primary']")
        public WebElement deleteAccountButtonvisible;

        @FindBy(xpath="//div[@class='radio-inline'][2]")
        public WebElement webElementTitle1;

    }
