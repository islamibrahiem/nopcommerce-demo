package runner;

import Test.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature"
,glue= {"steps"}
,plugin = {"pretty","html:target/cucumber-html-report"})

public class TestRunner extends TestBase {


}
