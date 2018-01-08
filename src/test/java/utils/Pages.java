package utils;

import Contentmanagement.AddMediaFiles;
import Contentmanagement.DeleteMediaFiles;
import homepage.HomePage;
import loginpage.LoginPage;
import logout.Logout;
import modaldialog.ModalDialog;
import moments.ViewMomentPage;
import utils.Base;

public class Pages {
    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) { //make sure you use JDK 1.7
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return page;
    }


    public static LoginPage LoginPage(){return getPage(LoginPage.class);}
    public static ModalDialog ModalDialog(){return getPage(ModalDialog.class);}
    public static HomePage HomePage(){return getPage(HomePage.class);}
    public static ViewMomentPage ViewMomentPage(){return getPage(ViewMomentPage.class);}
    public static AddMediaFiles AddMediaFiles(){return getPage(AddMediaFiles.class);}
    public static DeleteMediaFiles DeleteMediaFiles(){return getPage(DeleteMediaFiles.class);}
    public static Logout Logout(){return getPage(Logout.class);}
}
