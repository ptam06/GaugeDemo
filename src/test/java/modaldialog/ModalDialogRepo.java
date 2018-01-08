package modaldialog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ObjectBase;

public class ModalDialogRepo extends ObjectBase {

     public ModalDialogRepo(WebDriver driver){super(driver);}

    @FindBy(xpath="//div[@class='modal-content']")
    protected static WebElement sessionAlertPopup;

     @FindBy(xpath="//button[@id='confirm-button']")
     protected static WebElement sessionAlertYesButton;

     @FindBy(xpath="//button[@class='close']")
     protected static WebElement sessionAlertCloseButton;

    @FindBy(xpath="//button[@class='close']")
    protected static WebElement loginErrorAlert;


    @FindBy(xpath="//div[@class='login-message']/descendant::a[@class='dismiss']")
    protected static WebElement loginErrorAlertDismiss;

    @FindBy(xpath = "//div[@class='modal-content']")
    protected static WebElement modalDialog;
}
