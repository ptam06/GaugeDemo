package utils.homepagetest;

import com.thoughtworks.gauge.Step;
import org.testng.Assert;
import utils.Pages;

public class ViewMomentTest {
    @Step("Display moment details of particualr moment")
    public void momentStatus()
    {
        Assert.assertTrue(Pages.ViewMomentPage().momentDetails());
    }
}
