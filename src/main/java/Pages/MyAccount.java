package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase {

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div[6]/section/div/div/div/div[2]/div/div/div[2]/ul/li[9]/a")
	static WebElement changePassword_Icon;

	@FindBy(id = "OldPassword")
	static WebElement oldPassword_element;

	@FindBy(id = "NewPassword")
	static WebElement newPassword_element;

	@FindBy(id = "ConfirmNewPassword")
	static WebElement ConfirmNewPassword_element;

	@FindBy(xpath = "/html/body/div[6]/section/div/div/div/div[3]/div/div/form/div[2]/input")
	static WebElement changePasswordbtn;

	public static void changeThePassword(String oldPassword, String newPassword, String confirmNewPassword)
			throws InterruptedException {

		clickButton(changePassword_Icon);
		settext(oldPassword_element, oldPassword);
		settext(newPassword_element, newPassword);
		settext(ConfirmNewPassword_element, confirmNewPassword);
		clickButton(changePasswordbtn);

	}

}
