package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistration extends PageBase {

	public UserRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (id= "FirstName")
	WebElement firstname;
	@FindBy (id= "LastName")
	WebElement lastname;
	@FindBy (id= "Email")
	WebElement email;
	@FindBy (id= "ConfirmEmail")
	WebElement confirmEmail;
	@FindBy (id= "Password")
	WebElement password;
	@FindBy (id= "ConfirmPassword")
	WebElement confirmPassword;
	@FindBy (id= "Username")
	WebElement username;
	@FindBy (id= "register-button")
	WebElement registerbtn;



	public void wirteRegisterationData( String firstNametxt,
			String lastNametxt,
			String emailtxt,
			String confirmEmailtxt, 
			String passwordtxt,
			String confirmPasswordtxt,
			String usernameTxt) throws InterruptedException {
		Thread.sleep(2000);

		settext(firstname, firstNametxt);
		settext(lastname, lastNametxt);
		settext(email, emailtxt);
		settext(confirmEmail, confirmEmailtxt);
		settext(password, passwordtxt);
		settext(confirmPassword, confirmPasswordtxt);
		settext(username, usernameTxt);
		clickButton(registerbtn);

	}
}
