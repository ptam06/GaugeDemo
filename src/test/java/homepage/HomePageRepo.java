package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ObjectBase;

import java.util.List;

public class HomePageRepo extends ObjectBase{

   public HomePageRepo(WebDriver driver){super(driver);}

    @FindBy(xpath="//div[@class='float moment-status-box']/descendant::span")
    protected static List<WebElement> momentStatus;

    @FindBy(xpath="//div[@class='float moment-status-box']/descendant::h3")
    protected static List<WebElement> momentStatusValues;

    @FindBy(xpath="//div[@class='treasure-overlay-spinner-container']")
    protected static WebElement loadingSpinerOverlay;

    @FindBy(xpath="//span[contains(.,'DRAFT')]")
    protected static WebElement draftOption;

   @FindBy(xpath="//div[@class='top-moment-box']/descendant::div[@class='season-ticket-graph ng-isolate-scope']")
    protected static List<WebElement> topMomentStatus;

   @FindBy(xpath="//div[@class='moment-box-header']/descendant::h3[@class='ng-binding']")
   protected static List<WebElement> topMomentTitles;





}
