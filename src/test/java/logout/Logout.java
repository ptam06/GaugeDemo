package logout;


import com.thoughtworks.gauge.Gauge;
import utils.Base;

public class Logout extends Base{

    private static LogOutRepo lo;

    public Logout(){lo=new LogOutRepo(driver);}

    public static boolean logOutFromDashboard()
    {

        waitUntilElementIsVisible(lo.menuDropDownOptions);
      lo.menuDropDownOptions.click();
      sleep(1000);
      Gauge.writeMessage("LogOut successful");
      lo.logOutButton.click();
      return true;
    }

}
