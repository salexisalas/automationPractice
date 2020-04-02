package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.ContactUsPage;

public class WhenTest {
	
	public static WebDriver driver = GivenTest.driver;
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
