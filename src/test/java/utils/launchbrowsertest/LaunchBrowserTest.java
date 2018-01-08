package utils.launchbrowsertest;


import com.thoughtworks.gauge.Step;
import utils.Base;
import utils.driver.Driver;

import static utils.Base.sleep;

public class LaunchBrowserTest {

    public static String websiteurl=System.getenv("WEBSITE_URL");
    @Step("Open the dashboard")
    public void openDashboard()
    {

//        Driver.driver.manage().window().maximize();
        sleep(4000);
        Driver.driver.get(websiteurl);
        Base.driver=Driver.driver;
    }
}
