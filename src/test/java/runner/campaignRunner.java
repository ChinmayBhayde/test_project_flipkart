package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/uifeature/HomePage.feature"},
		glue =  {"steps"},
		plugin = {"pretty","html:target/cucumber-reports"},
		monochrome=true
		)

public class campaignRunner extends AbstractTestNGCucumberTests {
	
	

}