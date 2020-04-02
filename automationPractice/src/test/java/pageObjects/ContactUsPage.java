package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "id_contact")
	WebElement headingDropdown;
	
	@FindBy(id="email")
	WebElement emailField;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select")
	WebElement referenceDropdown;
	
	@FindBy(id="179494_order_products")
	WebElement productDropdown;
	
	@FindBy(id="message")
	WebElement messageTextBox;
	
	@FindBy(id="fileUpload")
	WebElement fileUpload;
	
	@FindBy(id="submitMessage")
	WebElement submitMessageBtn;
	
}
