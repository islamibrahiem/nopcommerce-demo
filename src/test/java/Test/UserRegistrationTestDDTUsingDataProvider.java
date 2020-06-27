package Test;

import org.opencv.objdetect.Objdetect;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;

public class UserRegistrationTestDDTUsingDataProvider extends TestBase {
	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;
	
	@DataProvider(name="testData")
	public static Object [][] fetchUserData()
	{
		return new Object [] [] {
			{"user_95","name","username3095@gmail.com","username3095@gmail.com",
				"usernametestpassword","usernametestpassword",
				"username_3095"}
		};
	}

	@Test(dataProvider="testData")
	public void userRegistration(String fName,String lName, String email,
			String confirmEmail, String userName,
			String password, String confirmPassword) throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.pressOnRegisterLink(driver);

		registrationObject = new UserRegistration(driver);
		registrationObject.wirteRegisterationData(fName,lName,email,confirmEmail,userName,password,confirmPassword);
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
