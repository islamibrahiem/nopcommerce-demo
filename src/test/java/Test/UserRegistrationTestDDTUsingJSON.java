package Test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistration;
import data.JSONDataReader;

public class UserRegistrationTestDDTUsingJSON extends TestBase {
	HomePage homeObject;
	UserRegistration registrationObject;
	LoginPage loginObject;
	
  	

	@Test
	public void userRegistration() throws InterruptedException, IOException, ParseException {
		
		 JSONDataReader dataReader = new JSONDataReader();
	   	 dataReader.JsonReader();
	
		homeObject = new HomePage(driver);
		homeObject.pressOnRegisterLink(driver);
		
		

		registrationObject = new UserRegistration(driver);
		registrationObject.wirteRegisterationData(dataReader.firstName,dataReader.lastName,
				dataReader.email,dataReader.confirmEmail,dataReader.password,
				dataReader.confirmPassword,dataReader.userName);
		Assert.assertTrue(homeObject.notificationSuccess.getText().contains("Your registration completed"));
	}

	@Test(dependsOnMethods = "userRegistration")
	public void closeTheNotification_test() throws InterruptedException {
		homeObject = new HomePage(driver);
		HomePage.closeTheNotification();
	}

	@Test(dependsOnMethods = "closeTheNotification_test")
	public void userLogout() throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.doLogoutafterlLogin(driver);
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
