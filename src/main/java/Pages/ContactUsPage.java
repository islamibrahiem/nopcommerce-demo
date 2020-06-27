package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	@FindBy(name ="Type")
//	public static WebElement request_Type;

	@FindBy(id = "Type")
	public static WebElement resquestTypeDropDownList;

	@FindBy(id = "FullName")
	public static WebElement fullName;

	@FindBy(id = "Email")
	public static WebElement email;

	@FindBy(id = "Enquiry")
	public static WebElement enquiry;

	@FindBy(css = "input.btn.blue-button")
	public static WebElement submit;

	@FindBy(css = "div.result")
	public static WebElement acceptanceMessageOFContactUS;

	public void typeYourINFtoContactUS(String fullNameTxt, String emailTxt, String enuiryTxt)
			throws InterruptedException {
		selectFormDropDownList(resquestTypeDropDownList, "General questions");
		settext(fullName, fullNameTxt);
		settext(email, emailTxt);
		settext(enquiry, enuiryTxt);

		clickButton(submit);
	}

}
