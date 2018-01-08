package utils.homepagetest;

import com.thoughtworks.gauge.Step;
import org.testng.Assert;
import utils.Pages;

public class HomepageTest {

    @Step("The moment status of Drafts, Live moments and Pending moments")
    public void homePageStatus()
    {
        Assert.assertTrue(Pages.HomePage().displayMomentStatus());
    }
}
