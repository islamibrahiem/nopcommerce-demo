package Test;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactUSinParallel extends TestBase2{
    HomePage homePageObject;
    ContactUsPage contactUsPageObject;

    String fullNametest = "Ahmed Ali";
    String emailtest = "AhmedAli@gmail.com";
    String enquirytest = "Test";

    @Test
    public void insertTheINFtoContactUs() throws InterruptedException {
        homePageObject = new HomePage(getDriver());
        homePageObject.pressOnContactUS();

        contactUsPageObject = new ContactUsPage(getDriver());
        contactUsPageObject.typeYourINFtoContactUS(fullNametest, emailtest, enquirytest);
        assertTrue(contactUsPageObject.acceptanceMessageOFContactUS.getText()
                .contains("Your enquiry has been successfully sent."));
    }

}
