package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//*[@id=\"index-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/a/span[1]")
	static WebElement beforeLoginandRegister_getmenu;

	@FindBy(xpath = "/html/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/ul/li[2]/a")
	static WebElement registerLink;

	@FindBy(className = "content")
	public static WebElement notificationSuccess;

	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
	public static WebElement notificationClose;

	@FindBy(xpath = "//*[@id=\"index-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/ul/li[1]/a")
	public static WebElement loginlink;

	@FindBy(xpath = "//*[@id=\"en-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/ul/li[1]/a")
	public static WebElement loginlinkafterLogout;

	@FindBy(xpath = "//*[@id=\"index-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[3]/a/span[2]")
	public static WebElement afterLogin_getmenu;

	@FindBy(xpath = "//*[@id=\"index-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[3]/ul/li[3]/a")
	public static WebElement logoutLinkafterLogin;

	@FindBy(xpath = "//*[@id=\"en-page\"]/body/div[6]/header/div/div[3]/div[1]/ul/li[2]/a/span[2]")
	public static WebElement afterLogout_getmenu;

	@FindBy(xpath = "/html/body/div[6]/header/div/div[3]/div[1]/ul/li[3]/ul/li[1]/a")
	public static WebElement myAccountLinkafterLogin;

	@FindBy(xpath = "/html/body/div[6]/header/div/div[2]/ul/li[3]/span")
	public static WebElement support_services;

	@FindBy(linkText = "Community forums")
	public static WebElement Community_forums;

	@FindBy(linkText = "Contact us")
	public static WebElement contactUS;

	public static void pressOnRegisterLink(WebDriver driver) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(beforeLoginandRegister_getmenu).perform();
		Thread.sleep(2000);
		clickButton(registerLink);
	}

	public static void closeTheNotification() throws InterruptedException {

		clickButton(notificationClose);
		Thread.sleep(20);
	}

	public static void pressOnLoginLink(WebDriver driver) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(beforeLoginandRegister_getmenu).perform();
		Thread.sleep(2000);
		clickButton(loginlink);
	}

	public static void doLogoutafterlLogin(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(afterLogin_getmenu).perform();
		Thread.sleep(2000);
		clickButton(logoutLinkafterLogin);
		Thread.sleep(2000);
	}

//	public static void userimageoverLoginafterLogout(WebDriver driver) throws InterruptedException {
//
//		Actions act = new Actions(driver);
//		act.moveToElement(afterLogout_getmenu).perform();
//		Thread.sleep(2000);
//		clickButton(loginlinkafterLogout);
//	}

	public static void openTheUserAccountafterLogin(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(afterLogin_getmenu).perform();
		Thread.sleep(2000);
		clickButton(myAccountLinkafterLogin);
		Thread.sleep(2000);
	}

	public static void pressOnDocumentation(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(support_services).perform();
		Thread.sleep(2000);
		clickButton(Community_forums);
	}

	public static void pressOnContactUS() {
		scrollDown();
		clickButton(contactUS);
	}

}
