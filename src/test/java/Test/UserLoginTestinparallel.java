
package Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;
import org.testng.annotations.Test;

public class UserLoginTestinparallel  extends TestBase2{
    HomePage homeObject;
    UserRegistration registrationObject;
    LoginPage loginObject;
    MyAccountTest myAccountTestObject;

    @Test
    public void UserLogin() throws InterruptedException {
        homeObject = new HomePage(getDriver());
        homeObject.pressOnLoginLink(getDriver());

        loginObject = new LoginPage(getDriver());
        loginObject.putTheLoginInformation(myAccountTestObject.userName_MyAccount, myAccountTestObject.oldpassword_MyAccount);
    }
}