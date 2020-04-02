package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	public static WebDriver driver = WhenTest.driver;
	WebElement navBar;
	
	@Then("User should by redirected to my account page")
	public void user_should_by_redirected_to_my_account_page() {
		navBar = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		Assert.assertEquals(navBar.getText(), "CREATE AN ACCOUNT");
		System.out.println("Asserted!");
	}
	
	@Then("User should not advance to my account page")
	public void user_should_not_advance_to_my_account_page() {
	    System.out.println("Missing required fields!");
	}
}
