package utils.driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver driver;

    // Initialize a webDriver instance of required browser

    @BeforeSuite
    public void initializeDriver()
    {
       driver= DriverFactory.getDriver();
        Base.driver=driver;
    }


   // Close the webdriver Instance

    @Step("close the dashboard")
    public void closeDriver()

    {
      driver.close();
    }

}
