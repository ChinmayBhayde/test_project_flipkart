package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	
	@FindBy(xpath = "//div[@class='_3sdu8W emupdz']/a/div/div/span/span[text()='Mobiles']")
	private WebElement mobile;
	
	@FindBy(xpath = "//div[@class='_3sdu8W emupdz']/div/div/div/span/span[text()='Fashion']")
	private WebElement fashion;
	
//	private By mobilesOption = By.xpath("//div[@class='_3sdu8W emupdz']/a/div/div/span/span[text()='Mobiles']/parent::span/parent::div");
//	private By fashionOption = By.xpath("//div[@class='_3sdu8W emupdz']/div/div/div/span/span[text()='Fashion']/parent::span/parent::div");
	
	private WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver){
		this.driver	= driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public boolean verifyMobileOption() {
//		WebElement mobile = driver.findElement(mobilesOption);
//		wait.until(ExpectedConditions.visibilityOf(mobile));

		boolean isDisplaying = mobile.isDisplayed();
		
		return isDisplaying;
		
	}
	public boolean verifyFashionOption() {
//		WebElement fashion = driver.findElement(fashionOption);
		boolean isDisplaying = fashion.isDisplayed();
		
		return isDisplaying;


	}
	public void clickOnMobileOption() {
//		WebElement mobile = driver.findElement(mobilesOption);
		mobile.click();
	}
}
