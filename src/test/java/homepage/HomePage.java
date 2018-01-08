package homepage;

import org.openqa.selenium.WebElement;
import utils.Base;

import java.util.List;

public class HomePage extends Base {

    private static HomePageRepo hp;

    public HomePage(){hp=new HomePageRepo(driver);}

    public static boolean displayMomentStatus()
    {
      sleep(3000);
     driver.navigate().refresh();
     if(isElementVisible(hp.loadingSpinerOverlay)==true) {
         waitForElementToBeInvisible(hp.loadingSpinerOverlay);
         sleep(1000);
     }
        if(isElementVisible(hp.draftOption))
        {
//            driver.navigate().refresh();
            sleep(5000);
           List<WebElement>momentName=hp.momentStatus;
           List<WebElement>momentValues=hp.momentStatusValues;

           for(int i=0;i<momentName.size();i++)
           {
               String values=momentValues.get(i).getText();
               System.out.println();
               System.out.println(momentName.get(i).getText()+  " count is "   +values);
           }


           List<WebElement>topmomentTitles=hp.topMomentTitles;
           List<WebElement>topmomentStatus=hp.topMomentStatus;

           for(int i=0;i<topmomentTitles.size();i++)
           {
               String topMomenStatusResult=topmomentStatus.get(i).getText();
               System.out.println();
               System.out.println(topmomentTitles.get(i).getText()+  " status is "  +topMomenStatusResult);


           }


        }
       return true;
    }
}
