package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.ContactUsPage;

public class GivenTest {
	public static WebDriver driver = SetUpClass.driver;
	ContactUsPage cu;
	
	HomePage hp = new HomePage(driver);;
	ProdInfo pi = new ProdInfo(driver);;

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
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("http://automationpractice.com/index.php?controller=contact");
		 driver.manage().window().maximize();
	}
}
