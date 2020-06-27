package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase extends AbstractTestNGCucumberTests{
	public static WebDriver driver;

	@BeforeSuite
	@org.testng.annotations.Parameters({"browser"})
	public void openURL(@Optional("chrome") String browserName) {
		if(browserName.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
		driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome-headless"))
		{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
		 options.addArguments("--window-size=1920,1080");
		driver = new ChromeDriver(options);
		}
		
		

		// System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		// driver = new FirefoxDriver();

		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		// driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		// driver.get(
		// "https://www.nopcommerce.com/demo?__cf_chl_jschl_tk__=2e290636cfa809e84061ea768cc37ad4564f2d51-1575864293-0-AWLNWgjw-9O6sphjxhjS-vFM7Gn9t7VFqCbXpziDCeO6efaKwBnmYisURfCJuj-l68wzldfWwkHTCajlsrMIayKnp7yAcptdg7A0ljTe0bggnQfV7X9YNGHiujbuCkh0gFkUrHrG5Mg_ymXhSsv5ugOk4H0IlXmI2gDXZyVaJ8DEbGOp3f90US-IyUNTeEzh1RU-FFmTSQKf2TBG6qWssGLpQ_6MwdhKiHGELwEIlGATmOR0mZUU1b3VcxewmTVfp-bY4GdTN-5pjycmPCqJSw4");
		driver.get("https://www.nopcommerce.com/en/");

	}

	@AfterMethod
	public void screenshotOnfailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking screenshot ...");
			Helper.captureScreenshot(driver, result.getName());
		}
	}

	@AfterSuite
	public void closeBrowser() {
		// driver.quit();
	}
}
