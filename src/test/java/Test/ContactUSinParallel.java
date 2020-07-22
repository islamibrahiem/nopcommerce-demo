package Test;

import Pages.ContactUsPage;
import Pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactUSinParallel extends TestBase2{
    HomePage homePageObject;
    ContactUsPage contactUsPageObject;

    String fullNametest = "Ahmed Ali";
    String emailtest = "AhmedAli@gmail.com";
    String enquirytest = "Test";

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Contact US")
    @Link(name = "Contact US Link", url = "https://www.nopcommerce.com/en/contact-us")
    public void insertTheINFtoContactUs() throws InterruptedException {
        homePageObject = new HomePage(getDriver());
        homePageObject.pressOnContactUS();

        contactUsPageObject = new ContactUsPage(getDriver());
        contactUsPageObject.typeYourINFtoContactUS(fullNametest, emailtest, enquirytest);
        assertTrue(contactUsPageObject.acceptanceMessageOFContactUS.getText()
                .contains("Your enquiry has been successfully sent."));
    }

}
