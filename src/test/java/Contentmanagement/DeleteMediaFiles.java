package Contentmanagement;

import org.openqa.selenium.WebElement;
import utils.Base;
import utils.Pages;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class DeleteMediaFiles extends Base {

    DeleteMediaFilesRepo DcmsR;
    public DeleteMediaFiles(){DcmsR = new DeleteMediaFilesRepo(driver);}


    public void waitUntilCMSPageIsVisible(){waitUntilElementIsVisible(DcmsR.CMSMediaPage);}
    public void waitForSpinnerToBeInvisible(){waitForElementToBeInvisible(DcmsR.loadingSpinner);}

    AddMediaFiles aCf = new AddMediaFiles();
    public boolean deleteCMS(){
       driver.navigate().refresh();
        if(isElementVisible(DcmsR.spinnerOverlay)==true){
            waitUntilElementIsVisible(DcmsR.spinnerOverlay);
        }

        aCf.navigateToCMS();
        Delete();
        return true;
    }

    public void Delete(){
        sleep(4000);
        List<WebElement> FileNames = DcmsR.fileName;
        int count=0;
        System.out.println("Total Media before deleting "+FileNames.size());
        for(int index=0; index<FileNames.size(); index++){
            WebElement cms = FileNames.get(index);
            String CMSname = cms.getText();
            if(CMSname.contains("testimage001")){
                DcmsR.deleteButton.get(index).click();
                Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
                DcmsR.yesButton.click();
                ++count;

                waitUntilElementIsVisible(DcmsR.successToastMessage);
                String successMsg = DcmsR.successToastMessage.getText();
                System.out.println("Success toast message is "+successMsg);
                waitForElementToBeInvisible(DcmsR.successToastMessage);

            }

        }
        System.out.println("Total Media after deleting "+FileNames.size());
        System.out.println("Total Deleted "+count);

    }





}
