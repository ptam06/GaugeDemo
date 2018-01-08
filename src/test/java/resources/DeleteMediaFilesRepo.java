package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.remote.RemoteWorker;
import utils.ObjectBase;

import java.rmi.Remote;
import java.util.List;

public class DeleteMediaFilesRepo extends ObjectBase {

    public DeleteMediaFilesRepo(WebDriver driver){super(driver);}
    @FindBy(xpath = "//div[@class=\"edit_field\"]")
    protected static List<WebElement> fileName;

    @FindBy(xpath = "//a[@data-ng-click=\"delete(media.id, media.url, media.name);\"]")
    protected static List<WebElement> deleteButton;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    protected static WebElement yesButton;
    @FindBy(xpath = ".//div[@class=\"toast-message\"]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//a[@href=\"#/content-management\"]")
    protected static WebElement CMStab;

    @FindBy(xpath = "//div[@ng-init=\"mediaLoad()\"]")
    protected static WebElement CMSMediaPage;
    @FindBy(xpath = "//div[@class=\"treasure-overlay-spinner\"]")
    protected static WebElement loadingSpinner;
}
