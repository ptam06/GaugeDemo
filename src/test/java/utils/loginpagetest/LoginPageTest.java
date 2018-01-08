package utils.loginpagetest;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import loginpage.LoginPage;
import org.testng.Assert;
import utils.Pages;
import utils.driver.Driver;

import java.util.List;

public class LoginPageTest extends Driver {

//    @Step("Use the login credentials from <username> and password as <password>")
//    public void loginValidation(String username,String password)
//    {
////        String UserName=System.getenv("USER_NAME");
////        String Password=System.getenv("PASSWORD");
//
//        Assert.assertTrue(Pages.LoginPage().isLoginUserPage(username,password));
//    }


    //Demo for table parameter
    @Step("use the login info from <username>")
    public void displayAccountDetails(Table AccountDetails) {
        for (TableRow row : AccountDetails.getTableRows()) {
            String username = row.getCell("username");

            System.out.println("usrname -->" + username);

        }

//
// }


    }
}