package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (id = "Username")
	static WebElement username ;

	@FindBy (id = "Password")
	static WebElement password;

	@FindBy (xpath = "/html/body/div[6]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")
	static WebElement loginbtn;

	public static void putTheLoginInformation(String usernameTxt ,String passwordtxt)
	{
		settext(username, usernameTxt);
		settext(password, passwordtxt);
		clickButton(loginbtn);
	}

}
