package utils.CMS;

import com.thoughtworks.gauge.Step;
import org.testng.Assert;
import utils.Pages;

public class AddMediaTest {

    @Step("Add Media Files")
    public void ableToAddMediaFiles() {
        Assert.assertTrue(Pages.AddMediaFiles().CMSAddMedia(), "Failed to upload media");

    }


    @Step("Delete Media Files")
    public void ableToDeleteMediaFiles() {
    Assert.assertTrue(Pages.DeleteMediaFiles().deleteCMS(), "Failed to delete media");

    }

}
