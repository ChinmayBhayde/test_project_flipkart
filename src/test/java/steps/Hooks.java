package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

	WebDriver driver;
	
//	@Before
//	public void launchBrowser() throws IOException
//	{
//		DriverFactory df = new DriverFactory();
//		driver = df.openBrowser();
//		driver.manage().window().maximize();
//	}
	
	@After(order = 1)
	public void tearDown(Scenario  scenario) throws InterruptedException
	{
		boolean isScenarioFailed = scenario.isFailed();
		
		if(isScenarioFailed)
		{
//			String scenarioName = scenario.getName();
			Thread.sleep(2000);
			driver.quit();
//			TakesScreenshot	ts = (TakesScreenshot)driver;
//			
//			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
//			
//			scenario.attach(source, "image/png", scenarioName);
		}
	}
	
	
//	@After(order = 1)
//	public void quitBrowser()
//	{
//		driver.quit();
//	}


}
