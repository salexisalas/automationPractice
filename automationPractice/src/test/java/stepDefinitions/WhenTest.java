package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProdInfo;
import pageObjects.ShoppingCartPage;

public class WhenTest {
	public static WebDriver driver = SetUpClass.driver;
	public static WebDriver driver = GivenTest.driver;
	
	HomePage hp = new HomePage(driver);
	LogInPage lg = new LogInPage(driver);
	ShoppingCartPage sc = new ShoppingCartPage(driver);

	@When("User adds an item to the shopping cart")
	public void user_adds_an_item_to_the_shopping_cart() {
	    hp.clickProduct(driver);
	    hp.clickAdd();
	}

	@When("User proceeds to checkout")
	public void user_proceeds_to_checkout() {
		hp.clickProceed();
	}

	@When("User signs in with email {string} and password {string}")
	public void user_signs_in_with_email_and_password(String email, String password) {
	    sc.clickProceed();
		lg.signIn(email, password);
	}

	
	@When("User forgets to agree with the terms and services")
	public void user_forgets_to_agree_terms_and_services() {
		sc.proceedNDontAgree();
	}

	@When("User completes checkout")
	public void user_completes_checkout() {
	    sc.completeCheckout();
	}



	ContactUsPage cu = new ContactUsPage(driver);;
	@When("User fills the entire form")
	public void user_fills_the_entire_form() {
	    // Write code here that turns the phrase above into concrete actions
	    cu = new ContactUsPage(driver);
	    cu.fillForm();
	}


	@When("User clicks on send button")
	public void user_clicks_on_send_button() {
	    // Write code here that turns the phrase above into concrete actions
	    cu.submitMessage();
	}
}
