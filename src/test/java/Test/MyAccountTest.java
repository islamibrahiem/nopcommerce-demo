package Test;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccount;
import Pages.UserRegistration;

public class MyAccountTest extends TestBase {

	HomePage homeObject;
	UserRegistration userRegistrationObject;
	LoginPage loginObject;
	MyAccount myAccountObject;

	public static String oldpassword_MyAccount = "usernametestpassword";
	public static String newPassword_MyAccount = "usernametestnewpassword";
	public static String confirmnewPassword_MyAccount = "usernametestnewpassword";
	public static String userName_MyAccount = "username_3502";

	@Test
	public void openUserAccount() throws InterruptedException {

		HomePage.openTheUserAccountafterLogin(driver);

	}

}
