package modaldialog;

import utils.Base;
import utils.Pages;

public class ModalDialog extends Base{
    private static ModalDialogRepo md;

    public  ModalDialog(){md=new ModalDialogRepo(driver);}

    public boolean waitUntilSessionAlertPopupisDisplayed(){waitUntilElementIsVisible(md.sessionAlertPopup); return true;}

    public void acceptSessionAlertDialog(){md.sessionAlertYesButton.click(); }

    public void dismissSessionAlertDialog(){md.sessionAlertCloseButton.click();}

    public boolean waitUntilLoginErrorAlertDialogDisplayed(){waitUntilElementIsVisible(md.loginErrorAlertDismiss); return true;}

    public void dismissLoginErrorAlert(){md.loginErrorAlertDismiss.click();}


    public void waitUntilModalDialogIsDisplayed() {
        waitUntilElementIsVisible(ModalDialogRepo.modalDialog);
    }




}
