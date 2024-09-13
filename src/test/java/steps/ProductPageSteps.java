package steps;

import org.openqa.selenium.WebDriver;

import POM.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {
	
	WebDriver driver;
	ProductPage product = new ProductPage(driver);
	
	@When("scroll to filter section")
	public void scroll_to_filter_section() {
	    product.scrollToFilter();
	}

	@When("select Apple from filter")
	public void select_apple_from_filter() {
	    product.selectAppleFilter();
	}

	@When("select Google from filter")
	public void select_google_from_filter() {
	    product.selectGoogleFilter();
	}

	@Then("user selects a bestseller {string} product")
	public void user_selects_a_bestseller_product(String string) {
	    product.checkBestseller(string);
	}

}
