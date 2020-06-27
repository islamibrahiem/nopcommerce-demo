package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;

public class UserRegistrationTest extends TestBase {
	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;

	@Test
	public void userRegistration() throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.pressOnRegisterLink(driver);

		registrationObject = new UserRegistration(driver);
		registrationObject.wirteRegisterationData("user_90", "name", "username3092@yahoo.com", "username3092@yahoo.com",
				"usernametestpassword", "usernametestpassword", "username_3092");
		Assert.assertTrue(homeObject.notificationSuccess.getText().contains("Your registration completed"));
	}

//	@Test(dependsOnMethods = "userRegistration")
//	public void closeTheNotification_test() throws InterruptedException {
//		homeObject = new HomePage(driver);
//		HomePage.closeTheNotification();
//	}
//
//	@Test(dependsOnMethods = "closeTheNotification_test")
//	public void userLogout() throws InterruptedException {
//		homeObject = new HomePage(driver);
//		homeObject.userLogout(driver);
//	}
//
//	@Test(dependsOnMethods = "userLogout")
//	public void userLogin() throws InterruptedException {
//		homeObject = new HomePage(driver);
//		homeObject.userLogin(driver);
//
//		loginObject = new LoginPage(driver);
//		loginObject.userLoginText("username_3091", "usernametestpassword");
//
//	}

}
