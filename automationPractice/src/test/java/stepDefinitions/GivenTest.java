package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProdInfo;

public class GivenTest {
	
	//Driver call
	
	public static WebDriver driver = SetUpClass.driver;
	
	//Page object calls
	ContactUsPage cu;
	HomePage hp = new HomePage(driver);
	ProdInfo pi = new ProdInfo(driver);
	LogInPage lg;
	
	@Given("User enters valid email {string} on login page and clicks on create account button")
	public void user_enters_valid_email_on_login_page_and_clicks_on_create_account_button(String email) {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		lg = new LogInPage(driver);
		lg.createAccount(email);
	}

	@Given("User clicks on Send to a page link")
	public void user_clicks_on_Send_to_a_page_link() {
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		hp.clickProduct(driver);
		hp.productClick();
		pi.friendemailbtn();
	}
	
	
	@Given("User is on the Home Page")
	public void user_is_on_the_Home_Page() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}



	@Given("User is on ContactUs page")
	public void user_is_on_ContactUs_page() {
		 driver.get("http://automationpractice.com/index.php?controller=contact");
		 driver.manage().window().maximize();
	}
}
