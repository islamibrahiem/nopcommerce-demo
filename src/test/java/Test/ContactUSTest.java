package Test;

import static org.testng.Assert.assertTrue;

import org.springframework.util.Assert;
import org.testng.annotations.Test;

import Pages.ContactUsPage;
import Pages.HomePage;

public class ContactUSTest extends TestBase {

	HomePage homePageObject;
	ContactUsPage contactUsPageObject;

	String fullNametest = "Ahmed Ali";
	String emailtest = "AhmedAli@gmail.com";
	String enquirytest = "Test";

	@Test
	public void insertTheINFtoContactUs() throws InterruptedException {
		homePageObject = new HomePage(driver);
		homePageObject.pressOnContactUS();

		contactUsPageObject = new ContactUsPage(driver);
		contactUsPageObject.typeYourINFtoContactUS(fullNametest, emailtest, enquirytest);
		assertTrue(contactUsPageObject.acceptanceMessageOFContactUS.getText()
				.contains("Your enquiry has been successfully sent."));
	}

}
