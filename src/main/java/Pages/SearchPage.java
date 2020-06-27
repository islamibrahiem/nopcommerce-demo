package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="forums-small-searchterms")
	public static WebElement searchTextBox;
	
	@FindBy(css="input.button-blue.sprite-image.search-box-submit")
	public static WebElement searchMark; 
	
	public static void typeTheSearchWord(String searchWord) throws InterruptedException
	{
		settext(searchTextBox, searchWord);
		clickButton(searchMark);
	}

}
