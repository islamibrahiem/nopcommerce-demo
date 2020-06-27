package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;
import data.LoadProperties;

public class UserRegistrationTestDDTUsingPropertiesFile extends TestBase {
	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;
	String firstName = LoadProperties.userData.getProperty("firstName");
	String  lastName = LoadProperties.userData.getProperty("lastName");
	String email = LoadProperties.userData.getProperty("email");
	String  confirmEmail = LoadProperties.userData.getProperty("confirmEmail");
	String userName = LoadProperties.userData.getProperty("userName");
	String password = LoadProperties.userData.getProperty("password");
	String confirmPassword = LoadProperties.userData.getProperty("confirmPassword");

	@Test
	public void userRegistration() throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.pressOnRegisterLink(driver);

		registrationObject = new UserRegistration(driver);
		registrationObject.wirteRegisterationData(firstName,lastName,email,confirmEmail,
				password,confirmPassword,
				userName);
		//Assert.assertTrue(homeObject.notificationSuccess.getText().contains("Your registration completed"));
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
