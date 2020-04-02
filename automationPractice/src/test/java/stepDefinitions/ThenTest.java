package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.ContactUsPage;

public class ThenTest {
	
	public static WebDriver driver = WhenTest.driver;
	ContactUsPage cu;
	
	@Then("User should see confirmation message {string}")
	public void user_should_see_confirmation_message(String message) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement cMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		 Assert.assertTrue(cMessage.getText().equals(message));	
	}
	
	@Then("User should see error message {string}")
	public void user_should_see_error_message(String message) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement cMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
		 Assert.assertTrue(cMessage.getText().equals(message));	}
	
}
