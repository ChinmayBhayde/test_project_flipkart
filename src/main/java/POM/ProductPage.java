package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	private By appleFilter = By.xpath("//div[@class='SDsN9S']/div/div/div/label/div[text()='Apple']");
	private By googleFilter = By.xpath("//div[@class='SDsN9S']/div/div/div/label/div[text()='Google']");
	private By bestSellerItem = By.xpath("//a[@class='CGtC98']/div/div[text()='Bestseller']/parent::div/following-sibling::div[@class='yKfJKb row']/div/div[contains(text(),'Apple')]");

	
	public ProductPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scrollToFilter() {
		WebElement apple = driver.findElement(appleFilter);
		wait.until(ExpectedConditions.visibilityOf(apple));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", apple);
		
	}
	public void selectAppleFilter() {
		WebElement apple = driver.findElement(appleFilter);
		apple.click();
		
	}
	public void selectGoogleFilter() {
		WebElement google = driver.findElement(googleFilter);
		google.click();
		
	}
	public void checkBestseller(String s1) {
		WebElement bestseller = driver.findElement(bestSellerItem);
		String s = bestseller.getText();
		Assert.assertEquals(s, s.contains(s1));
	}
}
