package moments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Base;

public class ViewMomentPage extends Base {
    private static ViewMomentRepo vm;

    public ViewMomentPage(){vm=new ViewMomentRepo(driver);}

     public static boolean momentDetails()
     {
         sleep(3000);

         for(int i=0;i<vm.momentCards.size();i++) {

             mouseHoverOnElement(vm.momentCards.get(i));
              sleep(3000);
//              System.out.println("Hovered");
              vm.viewMomentButton.get(i).click();
             sleep(3000);
//             System.out.println("Entered detail page");
             waitUntilElementIsVisible(vm.momentName);
             sleep(3000);
             String s = vm.momentName.getText();
             System.out.println("Moment name is : "+s);
             System.out.println("Values are : ");
             for(int j=0;j<vm.momentDetails.size();j++) {
                 waitUntilElementIsVisible(vm.momentDetails.get(j));
                 sleep(5000);

                 System.out.println(vm.momentDetails.get(j).getText());
             }
              driver.navigate().back();
             sleep(3000);

//             System.out.println("Returned back");
             driver.navigate().refresh();
             sleep(3000);
        waitUntilElementIsVisible(vm.momentCards.get(i));


         }


         return true;
     }


}
