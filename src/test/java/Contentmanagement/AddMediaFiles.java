package Contentmanagement;

import utils.Base;

import java.util.concurrent.TimeUnit;

public class AddMediaFiles extends Base {

    AddMediaFilesRepo AmFr;
    public AddMediaFiles(){ AmFr = new AddMediaFilesRepo(driver);}
    public void waitUntilCMSPageIsVisible(){waitUntilElementIsVisible(AddMediaFilesRepo.CMSMediaPage);}
    public void waitUntilBrowseButtonIsVisible(){waitUntilElementIsVisible(AddMediaFilesRepo.browse);}
    public void waitForSpinnerToBeInvisible(){waitForElementToBeInvisible(AddMediaFilesRepo.loadingSpinner);}
    public void navigateToCMS(){
        if (isElementVisible(AddMediaFilesRepo.cmsTitle)==false) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            AddMediaFilesRepo.resourceTab.click();
            AddMediaFilesRepo.CMStab.click();
            waitUntilCMSPageIsVisible();
        }

    }
    String mediaPath = "C:\\Users\\Amal.AMAL\\Desktop\\MavenDemo\\src\\test\\java\\Contentmanagement\\testimage001.jpg";
    public boolean CMSAddMedia(){

       // refreshPage();
        if(isElementVisible(AmFr.spinnerOverlay)==true){
            waitUntilElementIsVisible(AmFr.spinnerOverlay);
        }

        navigateToCMS();
        System.out.println("Add media");
        try {
            AddMediaFilesRepo.browse.sendKeys(mediaPath);
        }
        catch(Exception e){
            System.out.println(e);
        }

        try {
            waitForSpinnerToBeInvisible();
            waitUntilElementIsVisible(AddMediaFilesRepo.uploadButton);
            AddMediaFilesRepo.uploadButton.click();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            waitForElementToBeInvisible(AddMediaFilesRepo.loadingMedia);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
            waitForSpinnerToBeInvisible();
        }
        catch(Exception e){
            System.out.println(e);
        }
        sleep(3000);
        String Name = AddMediaFilesRepo.fileName.get(0).getText();
        System.out.println("File name is matching 001 and "+ Name);
        AddMediaFilesRepo.viewFile.get(0).click();

        try {
            String successMsg = AddMediaFilesRepo.successToastMessage.getText();
            System.out.println("Success toast message is "+successMsg);
            waitForElementToBeInvisible(AddMediaFilesRepo.successToastMessage);
            AddMediaFilesRepo.dismissButton.click();
            System.out.println("Clicked on dismiss button");
        }
        catch(Exception e){
            System.out.println(e);
        }

        return true;
    }
}
