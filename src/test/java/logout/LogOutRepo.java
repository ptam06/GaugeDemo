package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ObjectBase;

import java.util.List;

public class LogOutRepo extends ObjectBase {

public LogOutRepo(WebDriver driver){super(driver);}

    @FindBy(xpath="//img[@alt=\"user\"]")
    protected static WebElement menuDropDownOptions;

    @FindBy(xpath="//a[contains(.,\"Logout\")]")
    protected static WebElement logOutButton;


}
