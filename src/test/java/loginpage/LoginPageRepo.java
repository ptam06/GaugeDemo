package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import utils.ObjectBase;

public class LoginPageRepo extends ObjectBase{
    public LoginPageRepo(WebDriver driver){super(driver);}

    @FindBy(xpath="//div[@class='login-page ng-scope']")
    protected static WebElement loginPageVisible;

    @FindBy(xpath="//input[@id='login-username']")
    protected static WebElement userNameorEmailField;

    @FindBy(xpath="//input[@id='login-password']")
    protected static WebElement passwordField;

    @FindBy(xpath="//button[@id='login-submit']")
    protected static WebElement submitButton;

    @FindBy(xpath="//div[@class='modal-content']")
    protected static WebElement sessionAlertPopup;


}
