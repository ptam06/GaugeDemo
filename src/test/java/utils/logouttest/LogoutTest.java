package utils.logouttest;

import com.thoughtworks.gauge.Step;
import org.testng.Assert;
import utils.Pages;

public class LogoutTest {

//    @Step("Logout from dashboard")
    public void dashboardLogout()
    {
        Assert.assertTrue(Pages.Logout().logOutFromDashboard());
    }
}
