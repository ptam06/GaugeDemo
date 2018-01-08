package moments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ObjectBase;

import java.util.List;

public class ViewMomentRepo extends ObjectBase {

    public ViewMomentRepo(WebDriver driver){super(driver);}

    @FindBy(xpath="//div[@class=\"single-moment-box ticket-offer ng-scope\"]")
    protected static List<WebElement> momentCards;

    @FindBy(xpath="//a[@class='view-moment-button']")
    protected static List<WebElement> viewMomentButton;


    @FindBy(xpath="//div[@class=\"page-title breadcrumb-title\"]/descendant::li[@class=\"active ng-binding\"]")
    protected static WebElement momentName;

    @FindBy(xpath="//div[@class=\"total-count-column\"]/descendant::span")
    protected static List<WebElement> momentDetails;





}
