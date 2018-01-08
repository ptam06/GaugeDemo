package loginpage;

import utils.Base;
import utils.Pages;

import static utils.Base.*;

public class LoginPage extends Base {
    private static LoginPageRepo lp;


    public LoginPage() {
        lp = new LoginPageRepo(driver);
    }

    public static boolean isLoginUserPage(String username, String password) {
        waitUntilElementIsVisible(lp.loginPageVisible);

        if (isElementVisible(lp.userNameorEmailField)) {


            lp.userNameorEmailField.sendKeys(username);
            lp.passwordField.sendKeys(password);
            sleep(10000);
            lp.submitButton.click();


        }

        try {
            Pages.ModalDialog().waitUntilSessionAlertPopupisDisplayed();
            Pages.ModalDialog().acceptSessionAlertDialog();
        } catch (Exception e) {

        }


        try {


            while (isElementVisible(lp.sessionAlertPopup) == false) {
                Pages.ModalDialog().dismissLoginErrorAlert();
                sleep(2000);
                lp.submitButton.click();


                try {
                    Pages.ModalDialog().waitUntilLoginErrorAlertDialogDisplayed();

                } catch (Exception e) {

                }


            }
            sleep(2000);
            Pages.ModalDialog().acceptSessionAlertDialog();

        } catch (Exception e) {

        }
    return true;

    }
}