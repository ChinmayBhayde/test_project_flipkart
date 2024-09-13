package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import POM.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import launchBrowser.DriverFactory;

public class HomePageSteps {
	
	WebDriver driver;
	HomePage hp = new HomePage(DriverFactory.getDriver());
	
	@SuppressWarnings("deprecation")
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
//		driver = new ChromeDriver();
		driver = new SafariDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@When("user verifies Mobiles option")
	public void user_verifies_mobiles_option() {
		System.out.println("step 2 executing, driver ="+driver);
	    boolean isDisplayed = hp.verifyMobileOption();
	    Assert.assertEquals(isDisplayed, true);
	}

	@Then("user verifies Fashion option")
	public void user_verifies_fashion_option() {
	    boolean isDisplayed= hp.verifyFashionOption();
	    Assert.assertEquals(isDisplayed, true);
	}

	@Then("user click on Mobiles option")
	public void user_click_on_mobiles_option() {
	    hp.clickOnMobileOption();
	}
}