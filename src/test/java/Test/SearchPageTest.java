package Test;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchPage;

public class SearchPageTest extends TestBase {
	 

	HomePage homePageObject;
	SearchPage searchPageObject;
	
	String search_word= "email";
	
	@Test
	public void openTheSearchPage() throws InterruptedException
	{
		homePageObject = new HomePage(driver);
		homePageObject.pressOnDocumentation(driver);
		
		searchPageObject = new SearchPage(driver);
		searchPageObject.typeTheSearchWord(search_word);
		
	}

}
