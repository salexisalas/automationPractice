package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProdInfo;
import pageObjects.ShoppingCartPage;

public class ThenTest {
	ContactUsPage cu;
	HomePage hp;
	LogInPage lg;
	ProdInfo pi;
	ShoppingCartPage sc;
	
	WebDriver driver = WhenTest.driver;
	
	@Then("User should see email sent confirmation")
	public void user_clicks_on_send_button() {
		WebElement lblAlert = driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/p[1]"));
		Assert.assertTrue(lblAlert.getText().equals("Your e-mail has been sent successfully"));
	}
	
	@Then("Page should ask user to fill all required fields")
	public void page_reguests_fields() {
		WebElement lblAlert = driver.findElement(By.id("send_friend_form_error"));
		Assert.assertTrue(lblAlert.getText().equals("You did not fill required fields"));
	}	
	
	@Then("User should recieve an order confirmation")
	public void user_should_recieve_an_order_confirmation() {
		sc = new ShoppingCartPage(driver);
		Assert.assertTrue(sc.getConfirmationTitle().equals("ORDER CONFIRMATION"));
	}
	@Then("User should see the following error : {string}")
	public void user_should_see_the_following_error(String error) {
		sc = new ShoppingCartPage(driver);
		Assert.assertTrue(sc.getAgreeError().equals(error));
	}
		@Then("User should see confirmation message {string}")
	public void user_should_see_confirmation_message(String message) {
		 WebElement cMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		 Assert.assertTrue(cMessage.getText().equals(message));	
	}
	
	@Then("User should see error message {string}")
	public void user_should_see_error_message(String message) {
		 WebElement cMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
		 Assert.assertTrue(cMessage.getText().equals(message));	
	}
}
