package Pages;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	public static WebDriver driver;
	public static JavascriptExecutor jse;
	public static Select select;

	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton(WebElement button) {
		button.click();
	}

	protected static void settext(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

	public static void scrollDown() {
		jse.executeScript("scrollBy(0,2500)");
	}

	public static void selectFormDropDownList(WebElement dropDownListName, String optionName) {
		select = new Select(dropDownListName);
		select.selectByVisibleText(optionName);
	}

	// public static String getAlphaNumericString(int n)
	// {
	//
	// // chose a Character random from this String
	// String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	// + "0123456789"
	// + "abcdefghijklmnopqrstuvxyz";
	//
	// // create StringBuffer size of AlphaNumericString
	// StringBuilder sb = new StringBuilder(n);
	//
	// for (int i = 0; i < n; i++) {
	//
	// // generate a random number between
	// // 0 to AlphaNumericString variable length
	// int index
	// = (int)(AlphaNumericString.length()
	// * Math.random());
	//
	// // add Character one by one in end of sb
	// sb.append(AlphaNumericString
	// .charAt(index));
	// }
	//
	// return sb.toString();
	// }

}
