package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

public class GivenTest {
	public static WebDriver driver = SetUpClass.driver;

	@Given("User is on the Home Page")
	public void user_is_on_the_Home_Page() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}


}
