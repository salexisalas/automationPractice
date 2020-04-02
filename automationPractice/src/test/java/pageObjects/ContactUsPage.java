package pageObjects;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	Random rand = new Random();
	int randomSubject = rand.nextInt(2) + 1;
	int randomReference = rand.nextInt(100000);
	String randomEmail = "test" + Integer.toString(rand.nextInt(100)) + "@gmail.com";
	
	@FindBy(id= "id_contact")
	WebElement hDropdown;
	
	@FindBy(id="email")
	WebElement emailField;

	@FindBy(id ="id_order")
	WebElement rDropdown;
	
	@FindBy(id="id_order")
	WebElement productDropdown;
	
	@FindBy(id="message")
	WebElement messageTextBox;
	
	@FindBy(id="fileUpload")
	WebElement fileUpload;
	
	@FindBy(id="submitMessage")
	WebElement submitMessageBtn;
	
	public void fillForm() {
		Select headingDropdown = new Select(hDropdown);
		headingDropdown.selectByIndex(randomSubject);
		emailField.sendKeys(randomEmail);
		rDropdown.sendKeys(Integer.toString(randomReference));
		fileUpload.sendKeys("C:/Users/test.admin/Documents/GitHub/automationPractice/automationPractice/src/test/resources/textFiles/attachedFile.txt");
		messageTextBox.sendKeys("This is my message");
	}

	
	public void submitMessage() {
		submitMessageBtn.click();
	}
}
