package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import Test.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration extends TestBase {

	HomePage homeObject;
	Pages.UserRegistration registrationObject;
	LoginPage loginObject;



	@Given("the user in the home page")
	public void the_user_in_the_home_page() throws InterruptedException {
       System.out.println("Welcome");
	}

	@When("I click on register link")
	public void I_click_on_register_link() throws InterruptedException {
		homeObject = new HomePage(driver);
		HomePage.pressOnRegisterLink(driver);
	}

	@When("I enterred the user data")
	public void I_enterred_the_user_data() throws InterruptedException {
		registrationObject = new Pages.UserRegistration(driver);
		registrationObject.wirteRegisterationData("eslam", "metwaly", 
				"username3106@yahoo.com", "username3106@yahoo.com",
				"usernametestpassword", "usernametestpassword", "username_3106");
	}

	@Then("The registration page displayed successfully")
	public void The_registration_page_displayed_successfully() {
		Assert.assertTrue(homeObject.notificationSuccess.getText().contains("Your registration completed"));
	}
}
