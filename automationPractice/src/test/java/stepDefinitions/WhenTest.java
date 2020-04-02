package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.When;
import pageObjects.CreateAccount;
import pageObjects.LogInPage;

public class WhenTest {
	public static WebDriver driver = GivenTest.driver;
	CreateAccount newAccount;
	LogInPage lg;
	
	@When("User enters firstName {string}")
	public void user_enters_firstName(String name) {
	    newAccount = new CreateAccount(driver);
	    newAccount.getFirstName(name);
	}

	@When("User enters lastName {string}")
	public void user_enters_lastName(String lastName) {
	    newAccount.getLastName(lastName);
	}

	@When("Email is filled with previous email {string} from login page")
	public void email_is_filled_with_previous_email_from_login_page(String email) {
		newAccount.getEmail(email);
	}

	@When("User enters a password {string}")
	public void user_enters_a_password(String password) {
	    newAccount.getPassword(password);
	}

	@When("nameAddress {string} is filled with the name entered in previous textbox")
	public void nameaddress_is_filled_with_the_name_entered_in_previous_textbox(String nameInAddress) {
	    newAccount.getFirstNameAddress(nameInAddress);
	}

	@When("lastNameAddress {string} in addresses is filled with the last name entered in previous textbox")
	public void lastnameaddress_in_addresses_is_filled_with_the_last_name_entered_in_previous_textbox(String lastName) {
	    newAccount.getLastNameAddress(lastName);
	}

	@When("User enters address {string}")
	public void user_enters_address(String address) {
	    newAccount.getAddress(address);
	}

	@When("User enters city {string}")
	public void user_enters_city(String city) {
	    newAccount.getCity(city);
	}

	@When("User enters state {string}")
	public void user_enters_state(String state) {
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(driver.findElement(By.xpath("//*[@id=\"id_state\"]"))).perform();
		newAccount.getState(state);
	}

	@When("User enters zipCode {string}")
	public void user_enters_zipCode(String zipCode) {
		newAccount.getZipCode(zipCode);
	}

	@When("User enters country {string}")
	public void user_enters_country(String country) {
		Actions mouseHover = new Actions(driver);
		mouseHover.moveToElement(driver.findElement(By.xpath("//*[@id=\"id_country\"]"))).perform();
		newAccount.getCountry(country);
	}

	@When("User enters mobile {string}")
	public void user_enters_modile(String mobile) {
	    newAccount.getMobilePhone(mobile);
	}

	@When("User enters addressAlias {string}")
	public void user_enters_addressAlias(String addressAlias) {
		newAccount.getAddressAlias(addressAlias);
	}
	

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
	    newAccount.registerClick();
	}
}
