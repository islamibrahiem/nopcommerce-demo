package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;

public class UserLoginTest extends TestBase {

	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;
	MyAccountTest myAccountTestObject;

	@Test
	public void UserLogin() throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.pressOnLoginLink(driver);

		loginObject = new LoginPage(driver);
		loginObject.putTheLoginInformation(myAccountTestObject.userName_MyAccount, myAccountTestObject.oldpassword_MyAccount);
	}

}
