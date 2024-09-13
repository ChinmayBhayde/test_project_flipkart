package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {

	static WebDriver driver;

	public WebDriver openBrowser() 
	{
		WebDriverManager.safaridriver().setup();
		SafariOptions option = new SafariOptions();
		driver = new SafariDriver(option);
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}