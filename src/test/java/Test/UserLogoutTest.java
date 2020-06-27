package Test;

import org.testng.annotations.Test;

import Pages.HomePage;

public class UserLogoutTest extends TestBase {

	HomePage homeObject;

	@Test
	public void userLogout() throws InterruptedException {
		homeObject = new HomePage(driver);

		homeObject.doLogoutafterlLogin(driver);
	}
}
