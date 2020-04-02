package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.LogInPage;

public class GivenTest {
	public static WebDriver driver = SetUpClass.driver;
	LogInPage lg;
	
	@Given("User enters valid email {string} on login page and clicks on create account button")
	public void user_enters_valid_email_on_login_page_and_clicks_on_create_account_button(String email) {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		lg = new LogInPage(driver);
		lg.createAccount(email);
	}
}
