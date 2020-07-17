package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;

public class UserRegistrationParallelTesting extends TestBase2 {
	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;
	
	Faker fakeData = new Faker();
	String firstName = fakeData.name().firstName();
	String lastName = fakeData.name().lastName();
	String email = fakeData.internet().emailAddress();
	String confirmEmail = email;
	String userName = fakeData.name().fullName();
	String password = fakeData.number().digits(8).toString();
	String confirmPassword = password;

	@Test
	public void userRegistration() throws InterruptedException {
		homeObject = new HomePage(getDriver());
		homeObject.pressOnRegisterLink(getDriver());

		registrationObject = new UserRegistration(getDriver());
		registrationObject.wirteRegisterationData(firstName,lastName,email,confirmEmail
				,password,confirmPassword,userName);
		Assert.assertTrue(homeObject.notificationSuccess.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "userRegistration")
	public void closeTheNotification_test() throws InterruptedException {
		homeObject = new HomePage(getDriver());
		HomePage.closeTheNotification();
	}

	@Test(dependsOnMethods = "closeTheNotification_test")
	public void userLogout() throws InterruptedException {
		homeObject = new HomePage(getDriver());
		homeObject.doLogoutafterlLogin(getDriver());
	}
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
